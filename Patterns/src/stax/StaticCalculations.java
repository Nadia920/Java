package stax;

import java.util.List;

public interface StaticCalculations {
float averagePrice(List<Internet> interaction);
Internet theCheapest(List<Internet> interaction);
Internet theMostExpensive(List<Internet> interaction);
int numberOfPayments(List<Internet> interaction);

}

