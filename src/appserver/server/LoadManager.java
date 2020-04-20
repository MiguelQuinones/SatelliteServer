package appserver.server;

import java.util.ArrayList;
import appserver.satellite.Satellite;

/**
 *
 * @author Dr.-Ing. Wolf-Dieter Otte
 */
public class LoadManager
{

    static ArrayList satellites = null;
    static int lastSatelliteIndex = -1;
    
    int index = -1;
    


    public LoadManager()
    {
        satellites = new ArrayList<String>();
    }

    public void satelliteAdded(String satelliteName)
    {
        // add satellite
        // ...
        
        if(!satellites.contains(satelliteName))
        {
            satellites.add(satelliteName);
            System.out.println("Satellite added: " + satelliteName);
        }
    }


    public String nextSatellite() throws Exception
    {
        index += 1;
        int numberSatellites = satellites.size();
//      int nextIndex = index + 1;
        int firstIndex = 0;
        String satelliteName = (String) satellites.get(index);
//        String satelliteNext = (String) satellites.get(index + 1);

        
        synchronized (satellites)
        {
            // implement policy that returns the satellite name according to a round robin methodology
            // ...
            //loop through array list of sattelites (sattelitemanager has connectivity info)
            //until rach end of array list, if at end of array list restart to begin at beginning
            
                if( index == lastSatelliteIndex )
                {
                index = firstIndex;
                return satelliteName;
                }
                
                else
                {
                return satelliteName;
                }
                
            
            
            
            
        }
             // ... name of satellite who is supposed to take job
            
    }
        //filler value 'null'; return something else
        
}

