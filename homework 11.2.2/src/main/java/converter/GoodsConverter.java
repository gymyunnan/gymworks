package converter;



import org.springframework.core.convert.converter.Converter;

import pojo.GoodsModel;

public class GoodsConverter implements Converter<String, GoodsModel> {

	@Override
	public GoodsModel convert(String source) {
	
		GoodsModel goods = new GoodsModel();
		String stringValues[] = source.split(",");
		if(stringValues != null && stringValues.length==3) {
			goods.setGoodsname(stringValues[0]);
			goods.setGoodsprice(Double.parseDouble(stringValues[1]));
			goods.setGoodsnumber(Integer.parseInt(stringValues[2]));
			return goods;
		}else {
			throw new IllegalArgumentException(String.format("类型转换失败，需要格式 'apple, 10.58, 200', 但格式是[%s]", source));
		}
	}
	
}
