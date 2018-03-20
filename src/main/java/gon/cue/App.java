package gon.cue;

import gon.cue.model.crud.Operations;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Operations.getOperations().createDataBase();
        Operations.getOperations().close();
    }
}
