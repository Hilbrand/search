package nl.aerius.domain;

public enum SearchCapability {
  MOCK0(28), MOCK1(29), MOCK5(30);

  private final int bit;

  private SearchCapability(final int bit) {
    this.bit = bit;
  }

  public int getBit() {
    return bit;
  }
}
