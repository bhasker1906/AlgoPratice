package pratice02;

import java.util.HashMap;
import java.util.Map;

public class SqlExtract {
    public static void main(String[] args) {

        //String QID=args[0];
        //String argVals=args[1];



        String argvals="SG,20201231,ANSP";

        String[] arrValues=argvals.split(",");
        parseArgs(arrValues);


    }

    public static void parseArgs(String[] args){
        String arguments="country:$1;business:$2;sys:$3";
        String[] arrArguments=arguments.split(";");
        HashMap<String,String> mapValues=new HashMap<String,String>();
        for (int i=0;i<arrArguments.length;i++){
            mapValues.put(arrArguments[i].split(":")[0],args[i]);
        }

        String  Qry="Select * from tbl where country='${country}' and businessdt='${business}' and source='${sys}'";

        for (Map.Entry<String,String> ma :mapValues.entrySet()){
            System.out.println(ma.getKey());
            Qry=Qry.replace("${"+ma.getKey()+"}",ma.getValue());
        }
        System.out.println(Qry);

        System.out.println(mapValues.toString());
    }

}
