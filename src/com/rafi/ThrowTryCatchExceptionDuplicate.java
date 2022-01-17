package com.rafi;

import java.io.IOException;

class ThrowTryCatchExceptions {

        void myMethod (int num) throws IOException, ClassNotFoundException{
            if(num == 1)
                throw new IOException("IOException Occurred");
            else
                throw new ClassNotFoundException("ClassNotFoundException");
        }
    }
    public class ThrowTryCatchExceptionDuplicate {
        public static void main(String[] args) {
            try {
                com.rafi.ThrowTryCatchExceptions obj = new com.rafi.ThrowTryCatchExceptions();
                obj.myMethod(1);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }