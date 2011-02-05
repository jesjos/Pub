/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import edu.ucdavis.jr.*;

public class Barmaid extends java.lang.Object {
    { JRinit(); }
    private // NUMBER 8
    Cap_ext_ orderQueue;
    
    public Barmaid(// NUMBER 8
    Cap_ext_ orderQueue) {
        // Begin Expr2
        super();
        // Begin Expr2
        this.orderQueue = orderQueue;
        JRprocess();
    }
    protected boolean JRcalled = false;
    protected JRBarmaid jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRBarmaid();
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
