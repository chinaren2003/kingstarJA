package ksmdapija;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffdKey<br>
 * <i>native declaration : kingstarapi/linux/libfiles/KSUserApiStructEx.h:5832</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("ksmdapija") 
public class CThostOrderKeyField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderRefType
	 */
	@Array({13}) 
	@Field(0) 
	public Pointer<Byte > OrderRef() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u01f0\ufffd\u00f1\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(1) 
	public int FrontID() {
		return this.io.getIntField(this, 1);
	}
	/**
	 * \u01f0\ufffd\u00f1\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(1) 
	public CThostOrderKeyField FrontID(int FrontID) {
		this.io.setIntField(this, 1, FrontID);
		return this;
	}
	/**
	 * \ufffd\u1ef0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(2) 
	public int SessionID() {
		return this.io.getIntField(this, 2);
	}
	/**
	 * \ufffd\u1ef0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(2) 
	public CThostOrderKeyField SessionID(int SessionID) {
		this.io.setIntField(this, 2, SessionID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(3) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(4) 
	public Pointer<Byte > OrderSysID() {
		return this.io.getPointerField(this, 4);
	}
	public CThostOrderKeyField() {
		super();
	}
	public CThostOrderKeyField(Pointer pointer) {
		super(pointer);
	}
}
