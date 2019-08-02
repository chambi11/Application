package jsontest;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.chainsaw.Main;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Application {

	private static final Logger logger = Logger.getLogger(Application.class);
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		try {
			PropertyConfigurator.configure("src//main//resources//log4j.properties");
			serilizeJsonToFile();
		}
		catch(Exception e) {
			logger.error("Error caght in main func , " + e.getMessage());
		}
	}


	public static void serilizeJsonToFile() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			
			Address custAdd = new Address("", "TEL AVIV", "10021");
			ArrayList<PhoneNumber> phonesNumArr = new ArrayList<PhoneNumber>();
			phonesNumArr.add(new PhoneNumber(PhoneNumberTypeEnum.MOBILE, "+972-52-8694486"));
			Customer cust = new Customer("sagi", "Ben Ze'ev", 23,custAdd, phonesNumArr);
			String jsonCust = objectMapper.writeValueAsString(cust);
			logger.debug(jsonCust);
		}
		catch(JsonMappingException | JsonGenerationException e) {
			logger.error("Error caght in serilizeJsonToFile func from JSON object, " + e.getMessage());
			throw e;
		}
		catch(Exception e) {
			logger.error("Error caght in serilizeJsonToFile func , " + e.getMessage());
			throw e;
		}
	}
}
