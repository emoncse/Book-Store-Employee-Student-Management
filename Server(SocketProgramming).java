/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package socketprogramming;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Server {
    public static void main(String[] args){
        try {
            ServerSocket serverSocket = new ServerSocket(4900);
            System.out.println("Server running....");
            
            
            Socket connection = serverSocket.accept();
            System.out.println("1st Connection established.");
            Socket connection2 = serverSocket.accept();
            System.out.println("2nd Connection established.");
            Scanner inFromKeyboard = new Scanner(System.in);
            DataInputStream inFromClient = new DataInputStream(new BufferedInputStream(connection.getInputStream()));
            DataInputStream inFromClient2 = new DataInputStream(new BufferedInputStream(connection2.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connection.getOutputStream());
            DataOutputStream outToClient2 = new DataOutputStream(connection2.getOutputStream());
            String clientMessage = "";
            String clientMessage2 = "";
            while(!clientMessage.equals("over")){
                clientMessage = inFromClient.readUTF();
                clientMessage2 = inFromClient2.readUTF();
                System.out.println("Client 1 : " + clientMessage);
                System.out.println("Client 2 : " + clientMessage2);
                String serverResponse = inFromKeyboard.next();
                outToClient.writeUTF(serverResponse);
                outToClient2.writeUTF(serverResponse);
                outToClient.flush();
                outToClient2.flush();
            }
            inFromClient.close();
            inFromClient2.close();
            inFromKeyboard.close();
            outToClient.close();
            outToClient2.close();
            
            
        } catch (IOException e) {
            System.out.println("Exception : " + e);
        }
    }
    
    
}
