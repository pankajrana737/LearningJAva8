
public class MyMarkerInterfaceImpl implements MyMarkerInterface
{
			MyMarkerInterfaceImpl() throws Exception{
				
				if(this instanceof MyMarkerInterface) {
					System.out.println("custom marker object");
				}
				else {
					throw new Exception("not a marker interfafce");
				}
			}
	
		public static void main(String[] args) throws Exception {
			MyMarkerInterfaceImpl obj = new MyMarkerInterfaceImpl();
			Object obj1 = null ;
		System.out.println(obj1 instanceof MyMarkerInterface);
		}
}
