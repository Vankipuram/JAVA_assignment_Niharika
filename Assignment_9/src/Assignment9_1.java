import java.util.*;
import java.util.stream.Collectors; 

class Fruit{
	String name,color;
	int calories,price;
	Fruit(String name,int calories,int price,String color){
		this.name=name;
		this.calories=calories;
		this.price=price;
		this.color=color;
	}
}
class News{
	int newsId;
	String postedByUser,commentByUser,comments;
	public News(int newsId, String postedByUser, String commentByUser, String comments) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comments = comments;
	}
	
}
class Trader{
	String name,city;

	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
}
class Transaction{
	Trader trader;
	int year,value;
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	
}

public class Assignment9_1 {
	public static void main(String[] args) {
		List<Fruit> fruit = new ArrayList<Fruit>();
		fruit.add(new Fruit("Mango",20,20,"yellow"));
		fruit.add(new Fruit("Orange",100,30,"orange"));
		fruit.add(new Fruit("Grape",50,45,"black"));
		fruit.add(new Fruit("Apple",30,20,"red"));
		List<Integer> fruitList1 = fruit.stream()
				.filter(p -> p.calories <100)// filtering data  
                .map(p->p.calories)        // fetching price  
                .collect(Collectors.toList());
		System.out.println(fruitList1);
		
		fruit.stream()
		     .filter(Fruit ->Fruit.color=="red")
		     .forEach(Fruit -> System.out.println(Fruit.name));  
		
		
		List<News> news = new ArrayList<News>();
		news.add(new News(1,"Niharika"," niharika","Useful Article in the limited budget"));
		news.add(new News(2,"Kavya"," kavya","Useful info"));
		news.add(new News(3,"Sunitha"," sunitha","Useful Article"));
		news.add(new News(4,"Luckky","luckky","Useful info"));
		news.add(new News(5,"Ram"," ram","Useful Article"));
		news.add(new News(1,"Niharika"," niharika","Useful info"));
		/*News newsA = news.stream().max((news1, news2)->news1.comments>news2.comments?1:-1).get();
		System.out.println(newsA.comments);
		News newsB = news.stream().max((news1, news2)->news1.postedByUser>news2.postedByUser?1:-1).get();
		System.out.println(newsB.postedByUser);*/
		Comparator<News>comp = Comparator.comparingDouble(News::getComments);
		News maxComments =news.stream().max(comp).get();
		
		
				
	}

}
