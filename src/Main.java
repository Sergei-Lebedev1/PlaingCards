import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Сделать перечисление Suit (масть игральной карты)
//
//Сделать перечисление Rank (достоинство игральной карты)
//
//Сделать класс ИгральнаяКарта, включающий масть и достоинство
//
//в мейне сделать список из 5 произвольных игральных карт,
//вывести его в исходном порядке,
//затем вывести отсортированными по масти,
//затем вывести отсортированными по достоинству
public class Main {
    public static void main(String[] args) {
        List<PlayingCard> cards = new ArrayList<>();
        cards.add(new PlayingCard(Suit.HEARTS, Rank.SEVEN));
        cards.add(new PlayingCard(Suit.SPADES, Rank.TEN));
        cards.add(new PlayingCard(Suit.DIAMOND, Rank.FIVE));
        cards.add(new PlayingCard(Suit.DIAMOND, Rank.ACE));
        cards.add(new PlayingCard(Suit.CLUBS, Rank.KING));
        cards.add(new PlayingCard(Suit.SPADES, Rank.ACE));
        System.out.println("cards = " + cards);

        // Вывод карт в исходном порядке
        System.out.println("Исходный порядок карт:");
        for (PlayingCard card : cards) {
            System.out.println(card);


        }
        cards.sort(Comparator.comparing(a -> a.getSuit()));
        System.out.println("по масти ");
        for (PlayingCard card : cards) {
            System.out.println(card);


        }
        cards.sort(Comparator.comparing(a -> a.getRank()));
        System.out.println("по достоинству ");
        for (PlayingCard card : cards) {
            System.out.println(card);

        }
    }
}