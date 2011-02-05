/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRPub
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_test2_voidTovoid;
	public Cap_ext_ JRget_op_test2_voidTovoid() {
		return op_test2_voidTovoid;
	}
	public void JRset_op_test2_voidTovoid(Cap_ext_ op_test2_voidTovoid) {
		this.op_test2_voidTovoid = op_test2_voidTovoid;
	}

	public Cap_ext_ op_test_voidTovoid;
	public Cap_ext_ JRget_op_test_voidTovoid() {
		return op_test_voidTovoid;
	}
	public void JRset_op_test_voidTovoid(Cap_ext_ op_test_voidTovoid) {
		this.op_test_voidTovoid = op_test_voidTovoid;
	}

	public JRPub(JRPub copy)
	{
	this.op_test2_voidTovoid = copy.op_test2_voidTovoid;
	this.op_test_voidTovoid = copy.op_test_voidTovoid;

	}
	public JRPub(Object ... opSig)
	{
	this.op_test2_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_test_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);

	}
	public JRPub(boolean dummy)	{
	    super(dummy);
	this.op_test2_voidTovoid = Cap_ext_.noop;
	this.op_test_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRPub(true);
	}
    }
