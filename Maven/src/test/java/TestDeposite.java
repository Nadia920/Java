import deposite.Deposite;
import deposite.DepositeType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestDeposite {
    private Deposite deposite;
    private Deposite deposite1;
    private Deposite deposite2;

    @Before
    public void setUp() throws Exception {
        deposite = new Deposite(DepositeType.SHORT_TERM_DEPOSITE, "Урожайный Отзывный", 4.5, "от 3 месяцев", "Плавающая ставка, с капитализацией", "BYN");
        deposite1 = new Deposite(DepositeType.SAVING_DEPOSITE, "Беларусбанк-онлайн", 12.4, "от 3 месяцев", "Выплата процентов ежемесячно", "USD");
        deposite2 = new Deposite(DepositeType.TIME_DEPOSITE, "Легкий", 11.1, "От 90 до 720 дней", "Возможность пополнения и отзыва, гибкие условия размещения", "BYN");
    }


    @Test
    public void getAllUsers_NO_NULL() {
        List<Deposite> expected = Deposite.getAllDeposite();
        Assert.assertNotNull(expected);
    }

    @Test
    public void getAllDeposite() {
        List<Deposite> expected = Deposite.getAllDeposite();

        List<Deposite> actual = new ArrayList<>();
        actual.add(deposite);
        actual.add(deposite1);
        actual.add(deposite2);

        Assert.assertEquals("Списки депозитов не совпадают", expected, actual);
    }

    @Test
    public void getAllDeposite_SHORT_TERM_DEPOSITE() {
        List<Deposite> expected = Deposite.getAllDeposite(DepositeType.SHORT_TERM_DEPOSITE);

        List<Deposite> actual = new ArrayList<>();
        actual.add(deposite);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHowManyDeposite() {
        int expected = Deposite.getHowManyDeposite();
        int actual = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHowManyDeposite_SHORT_TERM_DEPOSITE() {
        int expected = Deposite.getHowManyDeposite(DepositeType.SHORT_TERM_DEPOSITE);
        int actual = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllPercent() {
        double expected = Deposite.getAllPercent();
        double actual = 4.5 + 12.4 + 11.1;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getAllPercent_SHORT_TERM_DEPOSITE() {
        double expected = Deposite.getAllPercent(DepositeType.SHORT_TERM_DEPOSITE);
        double actual = 4.5;
        Assert.assertEquals(expected, actual, 0);
    }
}