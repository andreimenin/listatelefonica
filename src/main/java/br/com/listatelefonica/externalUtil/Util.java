package br.com.listatelefonica.externalUtil;

import java.io.Serializable;
import java.math.BigDecimal;

public class Util implements Serializable {

	private static final long serialVersionUID = 3600541549693955357L;	

	/**
	 * 
	 * 
	 * @param
	 * @return
	 */
	public static boolean isNullOrZero(Number numero) {
		return numero == null || BigDecimal.valueOf(numero.doubleValue()).compareTo(BigDecimal.ZERO) == 0;
	}

	/**
	 * 
	 * 
	 * @param
	 * @return
	 */
	public static boolean isNotNull(Object obj) {
		return obj != null;
	}

	/**
	 * 
	 * 
	 * @param
	 * @return
	 */
	public static boolean isNull(Object obj) {
		return obj == null;
	}

	/**
	 * 
	 * 
	 * @param
	 * @return
	 */
	public static boolean isBlank(String string) {
		if (string != null) {
			return string.trim().isEmpty();
		}
		return true;
	}

	/**
	 * 
	 * 
	 * @param
	 * @return
	 */
	public static boolean isNullOrEmpty(String s) {
		if (s == null) {
			return true;
		}
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isWhitespace(s.charAt(i))) {
				return false;
			}
		}
		return false;
	}



}
