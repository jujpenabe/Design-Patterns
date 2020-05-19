public class PromoStrategy
	implements AdvertisingStrategy<Promo>,
						 Subject <Set<Promo>>{
						
	private Set<Observer<Set<Promo>>> observers;
	private Set<Promo> promos;
	
	public PromoStrategy( ){
		observers = new HashSet<Observer<Set<Promo>>>( );
		promos = new HashSet<Promo>( );
	}
	
	}
