class WorldClock extends Clock {
  int timeZone = 0;

  public WorldClock(int timeZone) {
    super();
    this.timeZone = timeZone;

  }

  public String getHours() {
    String hours = String.valueOf(Integer.parseInt(super.getHours()) + timeZone);
    return hours;
  }
}
