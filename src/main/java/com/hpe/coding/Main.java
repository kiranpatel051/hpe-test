package com.hpe.coding;



import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.hpe.coding.dto.Center;
import com.hpe.coding.dto.User;
import com.hpe.coding.utils.Util;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        try {
            Center[] centerArray = new Center[0];
            User[] userArray = new User[0];
            //JSON parser object to parse read file
            // create Gson instance
            Gson gson = new Gson();
            URL resource = null;
            Reader reader = null;

            /* create a reader for reading centers list file */
            try {
                String centerFileName = System.getProperty("centerFile");

                if (centerFileName == null) {
                    System.out.println("centerFile=" + "Resource://Center.txt");
                    resource = com.hpe.coding.Main.class.getResource("/Center.txt");
                    reader = Files.newBufferedReader(Paths.get(resource.toURI()));
                } else {
                    System.out.println("centerFile="+centerFileName);
                    reader = Files.newBufferedReader(Paths.get(centerFileName));
                }

                // convert JSON file to map
                centerArray = gson.fromJson(reader, Center[].class);

                // close reader
                reader.close();

            } catch (URISyntaxException e) {
                System.out.println("Centers List File Path Not correct Found");
                return;
            } catch (JsonSyntaxException| JsonIOException e) {
                System.out.println("Centers List File Not valid Json Format");
                return;
            } catch (IOException e) {
                System.out.println("Centers List File Not Found");
                return;
            }

            try {
            /* create a reader for reading people list file */
            String peopleFileName = System.getProperty("peopleFile");

            if(peopleFileName == null) {
                System.out.println("peopleFile=" + "Resource://People.txt");
                resource = com.hpe.coding.Main.class.getResource("/People.txt");
                reader = Files.newBufferedReader(Paths.get(resource.toURI()));
            } else {
                System.out.println("peopleFile="+peopleFileName);
                reader = Files.newBufferedReader(Paths.get(peopleFileName));
            }

            // convert JSON file to map
            userArray = gson.fromJson(reader, User[].class);

            // close reader
            reader.close();

            } catch (URISyntaxException e) {
                System.out.println("People List File Path Not correct Found");
                return;
            } catch (JsonSyntaxException| JsonIOException e) {
                System.out.println("People List File Not valid Json Format");
                return;
            } catch (IOException e) {
                System.out.println("People List File Not Found");
                return;
            }

            /*sort users by their Age */
            Arrays.sort(userArray);

            /* calculate nearest center for each users */
            Map<Center, List<User>> multiValueMap = calculateUserCenters(userArray, centerArray);
            for(Center center : centerArray) {
                multiValueMap.get(center).stream().forEach( user -> {
                    System.out.println(user.getName()+ "," + user.getCenter() + ", " + user.getAge());
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }

    private static Map<Center, List<User>> calculateUserCenters(User[] userArray, Center[] centerArray) {
        /* map for center to users mapping */
        Map<Center, List<User>> multiValueMap= new HashMap<>();
        for(Center center : centerArray) {
            multiValueMap.put(center, new ArrayList<User>());
        }

        /* calculate nearest center for each users */
        for(User user : userArray) {
            Double minDistance = Double.MAX_VALUE;
            Center userCenter = null;
            for(Center center : centerArray) {
                Double curDistance = Util.distance(user.getLatitude(), user.getLongitude(), center.getLatitude(), center.getLongitude());
                if(curDistance < minDistance) {
                    minDistance = curDistance;
                    userCenter = center;
                }
            }
            //set user's nearest center
            user.setCenter(userCenter.getName());
            //add user to center users list
            multiValueMap.get(userCenter).add(user);
        }
        return multiValueMap;
    }

}
