/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

import java.util.Scanner;

/**
 *
 * @author user
 */


public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your favorite actor: ");
        String favoriteActor = scanner.nextLine();

        System.out.println("User Profile created for " + name + " with favorite actor " + favoriteActor);
    }
    
}

    

