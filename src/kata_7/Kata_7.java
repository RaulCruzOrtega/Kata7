package kata_7;

import static spark.Spark.get;

public class Kata_7 {

    public static void main(String[] args) {
        FlightDB flightdb = new FlightDB();
        
        //http://localhost:4567/...
        
        get("/flights/all", (req, res) -> {
            return flightdb.getAll();
        });
        
        get("/flights/day/:day", (req, res) -> {
            return flightdb.getDay(req.params(":day"));
        });
        
        get("/flights/distance/bigger/:distance", (req, res) -> {
            return flightdb.getBiggerDistance(req.params(":distance"));
        });
        
        get("/flights/distance/lower/:distance", (req, res) -> {
            return flightdb.getLowerDistance(req.params(":distance"));
        });
        
        get("/flights/cancelled", (req, res) -> {
            return flightdb.getCancelled();
        });
        
        get("/flights/diverted", (req, res) -> {
            return flightdb.getDiverted();
        });
    }
    
}
