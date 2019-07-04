package com.stackroute;

public class ChessBoard {

    public String generateBoard(){

        //string buffer to store sresultant string pattern
        StringBuffer result = new StringBuffer("");
        for(int i=1;i<=8;i+=2){
            for(int j=1;j<=8;j++){
                if(j%2==1){
                    result.append("WW");
                }else {
                    result.append("BB");
                }

                result.append("|");
            }
            result.append("\n");
            for(int j=1;j<=8;j++){
                if(j%2==0){
                    result.append("WW");
                }else {
                    result.append("BB");
                }

                result.append("|");
            }
            result.append("\n");

        }
        System.out.println(result.substring(0,result.length()-1));
        return result.substring(0,result.length()-1);
    }
}
