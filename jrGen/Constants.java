/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


class Constants extends java.lang.Object {
    { JRinit(); }
    
    Constants() {
        // Begin Expr2
        super();
        JRprocess();
    }
    public static final int GC_WASH = 30;
    public static final int GC_COLLECT = 30;
    public static final int GC_REPLACE = 30;
    public static final int REST = 30;
    public static final int CUSTOMER_DROPINTIME = 30;
    public static final int N_OF_TABLES = 30;
    public static final int TABLE_SPACE = 30;
    public static final int GLASSES = 30;
    public static final int CUPS = 30;
    protected boolean JRcalled = false;
    protected JRConstants jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRConstants();
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
