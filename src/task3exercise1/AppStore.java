package task3exercise1;

public class AppStore {
    
    // 1. Declare your private attributes here:
    // NIM : .........................., 
    // NAMA : ........................., 
    //
    //------------------- your code here-----------------------
    private Application [] appList = new Application [100];
    private int totalApp;
    private int i;
    //---------------------------------------------------------
    
    // 2. Declare your Setter and Getter method here:
    // NIM : .........................., 
    // NAMA : ........................., 
    //
    public void setAppList(Application[] appList) {
        this.appList = appList;
    }

    public void setTotalApp(int totalApp) {
        this.totalApp = totalApp;
    }

    public Application[] getAppList() {
        return appList;
    }

    public int getTotalApp() {
        return totalApp;
    }
   
    
    // 3. Create method createNewApp( appName, appSize ) here:
    // NIM : .........................., 
    // NAMA : ........................., 
    // instantiate new Application object and insert it in array appList
    //
    //------------------- your code here-----------------------
    public void createNewApp (String appName,int appSize){
        if (i < 100){
            Application apps = new Application(appName,appSize);
            appList[totalApp] = apps;
            totalApp++;
            i++;
        }
    }
    
    //---------------------------------------------------------
    
    
    // 4. Create method getApp( id ) : Application here:
    // NIM : .........................., 
    // NAMA : ........................., 
    // returns Application object from array appList with array index = id
    //
    //------------------- your code here-----------------------
    public Application getApp(int id) {
        return appList[id];
    }
    //---------------------------------------------------------
        
    
    // 5. Create method toString() : String here:
    // NIM : .........................., 
    // NAMA : ........................., 
    // @return returns String that contains the number of Application available
    // 
    // example : "There are 5 applications ready to install"
    // 
    public String toString() {
    //------------------- your code here-----------------------
        return "There are " +totalApp+ "applications ready to install" ;
    
    //---------------------------------------------------------
    }
}
