public class CustomerPromoObserver
  implements Observer<Set<Promo>>{
  private Subject<Set<Promo>> subject;
  @Override
  public void update( Set<Promo> promos ){
    //Send message or notification with to the customer 
  }
  @Override public int hashCode( ){
    //return a unique identifier
  }
}
    
