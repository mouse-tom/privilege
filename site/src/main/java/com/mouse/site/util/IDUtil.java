package com.mouse.site.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IDUtil {
	private static long idnum = 0;
	private static long id_log_num = 0;
	private static long id_order_num = 0;
	private static long id_order_info_num = 0;
	private static long id_goods_num = 0;
	private static long id_goods_sku_num = 0;
	private static SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");

	/**
	 * @discription 通用ID生成器
	 * @author jinhl
	 * @created 2017年11月28日 下午7:56:00
	 * @return
	 */
	public static String getID() {
		idnum++;
		return format.format(new Date()) + getRandom() + idnum;
	}
	
	/**
	 * @discription 日志ID生成器
	 * @author jinhl
	 * @created 2017年11月28日 下午7:56:00
	 * @return
	 */
	public static String getLogID() {
		id_log_num++;
		return format.format(new Date()) + getRandom() + id_log_num;
	}

	/**
	 * @discription 订单ID生成器
	 * @author jinhl
	 * @created 2017年11月28日 下午7:54:39
	 * @return
	 */
	public static String getOrderID() {
		id_order_num++;
		return format.format(new Date()) + getRandom() + id_order_num;
	}

	/**
	 * @discription 订单详情ID生成器
	 * @author jinhl
	 * @created 2017年11月28日 下午7:54:56
	 * @return
	 */
	public static String getOrderInfoID() {
		id_order_info_num++;
		return format.format(new Date()) + getRandom() + id_order_info_num;
	}

	/**
	 * @discription 货品ID生成器
	 * @author jinhl
	 * @created 2017年11月28日 下午7:55:16
	 * @return
	 */
	public static String getGoodsID() {
		id_goods_num++;
		return format.format(new Date()) + getRandom() + id_goods_num;
	}

	/**
	 * @discription 货品详情ID生成器
	 * @author jinhl
	 * @created 2017年11月28日 下午7:55:35
	 * @return
	 */
	public static String getGoodsSkuID() {
		id_goods_sku_num++;
		return format.format(new Date()) + getRandom() + id_goods_sku_num;
	}

	private static String getRandom() {
		int random = (int) (Math.random() * 100000);
		if (random < 10) {
			return "0000" + random;
		}
		if (random < 100) {
			return "000" + random;
		}
		if (random < 1000) {
			return "00" + random;
		}
		if (random < 10000) {
			return "0" + random;
		}
		return "" + random;
	}
}
