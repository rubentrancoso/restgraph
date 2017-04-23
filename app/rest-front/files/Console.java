

import java.util.Map;
import java.util.Properties;

//import javax.inject.Inject;
//import javax.inject.Named;
//import javax.inject.Singleton;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
//import org.slf4j.Logger;

import com.google.gson.Gson;

//@Singleton
public class Console {
	
	//@Inject Logger log;
	
	//@Inject @Named("clientService")
//ClientService clientService;
	
	//@Inject 
	//FakeDataGeneratorService dataService;
	
//	private final int THREADCOUNT = 160;
//	private final double EXECTIMEMINUTES = 1;

	public void run() {	
		dropdata();	
//		clientService.get("http://localhost:8080/api-server/api/v1.0/mixedindex/indicegeral/name/String");
//		clientService.get("http://localhost:8080/api-server/api/v1.0/mixedindex/indicegeral/email/String");
		JSONObject result = null;
		result = addUser("Ruben Paulo Martins Trancoso", "rubentrancoso@gmail.com");
		Integer id;
		try {
			id = (Integer) result.get("_id");
			retrieveUserById(id);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		addMultiple(50);

		result = null;
//		result = clientService.get("http://localhost:8080/api-server/api/v1.0/users");
		System.out.println("get result: " + result);

//		result = clientService.get("http://localhost:8080/api-server/api/v1.0/users");
//		System.out.println("get result: " + result);
//		result = clientService.get("http://localhost:8080/api-server/api/v1.0/users?limit=10&offset=1");
//		System.out.println("get result: " + result);
//		result = clientService.get("http://localhost:8080/api-server/api/v1.0/users?limit=10&offset=2");
//		System.out.println("get result: " + result);
//		result = clientService.get("http://localhost:8080/api-server/api/v1.0/users?limit=10&offset=1");
//		System.out.println("get result: " + result);

//
//		result = clientService.delete("http://localhost:8080/api-server/api/v1.0/users/" + id);
//		System.out.println("delete result: " + result);	
//		
//		try {
//			id = result.getInt("_id");
//		} catch (JSONException e) {
//			e.printStackTrace();
//		}
//		
//		result = clientService.delete("http://localhost:8080/api-server/api/v1.0/users");
//		System.out.println("delete result: " + result);	
//		
//		result = clientService.get("http://localhost:8080/api-server/api/v1.0/users");
//		System.out.println("get result: " + result);
	}	
	
	
//	
//	for(int i=0;i<25;i++) {
//		properties.put("email", i + "@email.com");
//		properties.put("name", "usuario " + i);
//		result = null;
//		result = clientService.post("http://localhost:8080/api-server/api/v1.0/users", properties);
//		System.out.println("post result: " + result);	
//	}
//	Integer id = 0;
//	try {
//		id = (Integer) result.get("_id");
//	} catch (JSONException e) {
//		e.printStackTrace();
//	}
//		
	
	private void retrieveUserById(int id) {
		JSONObject result = null;
//		result = clientService.get("http://localhost:8080/api-server/api/v1.0/users/" + id);
		System.out.println("retrieveUserById [" + id + "]: " + result);
	}
	
	private void dropdata() {
//		clientService.get("http://localhost:8080/api-server/api/v1.0/data-drop");
	}
	
	private JSONObject addUser(String name, String email) {
		Properties properties = new Properties();
		Map<Object, Object> meta = properties;
		
		Gson input = new Gson();
		properties.put("email", email);
		properties.put("name", name);
		
		JSONObject result = null;
//		result = clientService.post("http://localhost:8080/api-server/api/v1.0/users", input.toJson(meta));
		
		return result;
	}
	
	private void addMultiple(int ammount) {	
		Properties properties = new Properties();
		for(int i=0;i<ammount;i++) {
			properties.put("email", i + "@email.com");
			properties.put("name", "usuario " + i);
//			clientService.post("http://localhost:8080/api-server/api/v1.0/users", properties);	
		}
	}


	
//	public void __run() {
//		
//		MyThread[] threadPool = new MyThread[THREADCOUNT];
//		MyThread thread = null;
//		for(int i=0;i<THREADCOUNT;i++) {
//			thread = new MyThread();
//			threadPool[i] = thread;
//			thread.setClientService(clientService);
//			thread.setDataService(dataService);
//			thread.start();
//		}
//		try {
//			Thread.sleep((long)(EXECTIMEMINUTES * 60 * 1000));
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		long total = 0;
//		for(int i=0;i<THREADCOUNT;i++) {
//			thread = threadPool[i];
//			thread.finish();
//			total = total + thread.insertsCount();
//		}
//		System.out.println("total inserts: " + total);
//		
//		clientService.get("http://localhost:8080/api-server/api/v1.0/data-drop");
//	}
//
//	
//	public void ____run() {	
//		clientService.get("http://localhost:8080/api-server/api/v1.0/data-drop");
//
//		Properties properties = new Properties();
//		properties.put("email", "rubentrancoso@gmail.com");
//		properties.put("name", "Ruben Paulo Martins Trancoso");
//		
//		Map<Object, Object> meta = properties;
//		
//		Gson input = new Gson();
//		
//		String result = null;
//		result = clientService.post("http://localhost:8080/api-server/api/v1.0/users", input.toJson(meta));
//		System.out.println("post result: " + result);
////		properties.put("email", "notreachable@hotmail.com");
////		properties.put("name", "Usuário Hotmail");
////		result = clientService.post("http://localhost:8080/api-server/api/v1.0/users", properties);
////		System.out.println("post result: " + result);
////
////		Gson converter = new Gson();
////		Properties vertexProperties = converter.fromJson(result, Properties.class);
////		String id = vertexProperties.getProperty("id");
////		
////		result = clientService.get("http://localhost:8080/api-server/api/v1.0/users/" + id);		
////		System.out.println("list result: " + result);
////		result = clientService.get("http://localhost:8080/api-server/api/v1.0/users");		
////		System.out.println("list result: " + result);
//				
////		properties = new Properties();
////		properties.put("name", "MyPage");
////		properties.put("owner", "Ruben Paulo Martins Trancoso");
////		
////		result = clientService.post("http://localhost:8080/api-server/api/v1.0/pages", input.toJson(meta));
////		System.out.println("post result: " + result);
//		
////		clientService.delete("http://localhost:8080/api-server/api/v1.0/users/" + id);
//	}
//	
//	public void _xrun() {	
//		try {
//			//clientService.get("http://localhost:8080/api-server/api/v1.0/data-drop");
//			RexsterClient client = RexsterClientFactory.open("192.168.1.18", 8184, "app");
//
//			// g.addVertex([name:'theseus',type:'human'])
//			// g.V('email','rubentrancoso@gmail.com').map
//			//for(int i=0;i<1000;i++)
//			//client.execute("g.addVertex([email:'rubentrancoso@gmail.com',type:'human'])");
//			//.execute("g.V('email',email).map",params);
//			//Map<String,Object> params = new HashMap<String,Object>();
//			//params.put("email","rubentrancoso@gmail.com");
//			List<Map<String, Object>> results = client.execute("g.V.map");
//			//System.out.println("results: "+ results.toString());
//			System.out.println("size    : "+ results.size());
//			Map<String, Object> map = results.get(1025);
//			System.out.println("map size: "+ map.size());
//			System.out.println("map     : "+ map.toString());
//			System.out.println("email   : "+ map.get("email"));
//			client.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
//	}
//	
////	private void initRexterClient() {
////		if(rexterClient==null) {
////			try {
////				rexterClient = RexsterClientFactory.open(ConfigurationConverter.getConfiguration(graphProperties));
////			} catch (Exception e) {
////				e.printStackTrace();
////			}
////		}
////	}
////	
////	public void test() {
////		Map<String, Object> param = new HashMap<String, Object>();
////		param.put("name", "juno");
////		List<Map<String, Object>> results;
////		try {
////			results = rexterClient.execute("g.V('name', 'pluto').map");
////			Map<String, Object> map = results.get(0);
////			rexterClient.close();
////			System.out.println(map.get("name"));
////		} catch (RexProException | IOException e) {
////			e.printStackTrace();
////		}
////	}
//	
//	public void ___run() {
//		// list all users -s
//		clientService.get("http://localhost:8080/api-server/api/v1.0/users");
//		
//		String input;
//		input = "{\"email\":\"rubentrancoso@gmail.com\"}";
//		// create a user
//		clientService.post("http://localhost:8080/api-server/api/v1.0/users", input);
//		input = "{\"email\":\"notreachable@hotmail.com\"}";
//		// create a user
//		clientService.post("http://localhost:8080/api-server/api/v1.0/users", input);
//		// list user
//		// clientService.get("http://localhost:8080/api-server/api/v1.0/users/1234");
//		// list users
//		clientService.get("http://localhost:8080/api-server/api/v1.0/users");
//		// delete all users
//		//clientService.delete("http://localhost:8080/api-server/api/v1.0/users");
//		
////		/users
////		post create a new user
////		clientService.post("http://localhost:8080/api-server/api/v1.0/users", input);
////		get list users
////		clientService.get("http://localhost:8080/api-server/api/v1.0/users");
////		put bulk update users
////		clientService.put("http://localhost:8080/api-server/api/v1.0/users", input);
////		delete delete all users
////		clientService.delete("http://localhost:8080/api-server/api/v1.0/users");
////		/users/1234
////		post error
////		get show a user
////		put update if existis otherwise error
////		delete delete a user
////		clientService.delete("http://localhost:8080/api-server/api/v1.0/users", input);		
//		
//	}
//	
//	public void _run() {
////		long acumulado = 0;
//		
////		log.info("@@@ application initialized");
////		clientService.get("http://localhost:8080/api-server/api/v1.0/users");
//		
//		clientService.get("http://localhost:8080/api-server/api/v1.0/data-drop");
//		
////		long inicio = System.currentTimeMillis();
////		String input;
////		for(int i=1;i<1000000;i++) {
////			input = "{\"email\":\"" + dataService.generateEmail() + "\"}";
////			long start = System.currentTimeMillis();
////			try {
////				clientService.post("http://localhost:8080/api-server/api/v1.0/users", input);
////			} catch (Exception e) {
////				break;
////			}
////			long end = System.currentTimeMillis();
////			long amostra = end - start;
////			acumulado +=  amostra;
////			long media = acumulado / i;
////			long duracao = end - inicio;
////			System.out.println(i + ". media: " + media + "ms / corrent: " + amostra + " duração: " + duracao);
////		}
////		long fim = System.currentTimeMillis();
////		System.out.println("duração: " + (fim - inicio) + "ms");
////		
//		// TODO recuperar jboss do broken pipe
//
//	}
	
}
