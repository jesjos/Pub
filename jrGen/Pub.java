/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;

public class Pub extends java.lang.Object {
    { JRinit(); }
    private // NUMBER 8
    Cap_ext_ closingAlarm;
    private // NUMBER 8
    Cap_ext_ orderQueue;
    
    public Pub() {
        // Begin Expr2
        super();
        // Begin Expr2
        closingAlarm = new Cap_ext_(new Op_ext_.JRProxyOp(InOp_ext_impl.create()));
        // Begin Expr2
        orderQueue = new Cap_ext_(new Op_ext_.JRProxyOp(InOp_ext_impl.create()));
        JRprocess();
    }
    
    public void initialize() {
        // Begin Expr2
        new Landlord(closingAlarm, orderQueue);
        // Begin Expr2
        new Barmaid(orderQueue);
    }
    
    public static void main(String[] args) {
        Pub p = new Pub();
    }
    protected boolean JRcalled = false;
    protected JRPub jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRPub();
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
