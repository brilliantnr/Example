package card;

public interface CardService {
	public void createCard();
	public CardBean readPattern(CardBean card);
	public void changeCard(CardBean card);
	public void deleteCard(CardBean card);
}
