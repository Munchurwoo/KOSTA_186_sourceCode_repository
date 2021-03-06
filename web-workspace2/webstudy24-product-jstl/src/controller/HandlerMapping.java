package controller;
/*
 *  객체 생성을 전담하는 Factory 객체 
 */
public class HandlerMapping {
	private static HandlerMapping instance=new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	public Controller create(String command) {
		Controller controller=null;
		if(command.equals("getAllProductList")) {
			controller=new GetAllProductListController();
		}else if(command.equals("findProductById")) {
			controller=new FindProductByIdController();
		}else if(command.equals("registerProduct")) {
			controller=new RegisterProductController();
		}else if(command.equals("findDeleteById"))
			controller=new FindDeleteByIdController();
		return controller;
	}
}














