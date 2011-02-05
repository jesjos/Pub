/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;

public class Landlord extends java.lang.Object {
    { JRinit(); }
    private // NUMBER 8
    Cap_ext_ orderQueue;
    private // NUMBER 8
    Cap_ext_ closingAlarm;
    
    public Landlord(// NUMBER 8
    Cap_ext_ closingAlarm, // NUMBER 8
    Cap_ext_ orderQueue) {
        // Begin Expr2
        super();
        // Begin Expr2
        this.orderQueue = orderQueue;
        // Begin Expr2
        this.closingAlarm = closingAlarm;
        JRprocess();
    }
    protected boolean JRcalled = false;
    protected JRLandlord jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRLandlord();
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
