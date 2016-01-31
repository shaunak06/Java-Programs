/*The purpose of this class is to model a television*/
//Shaunak Pandit 12/4/14
//CSI 201

public class Television
{
  private String MANUFACTURER; //A constant of the TV manufacturer
  private int SCREEN_SIZE; //a constant for the screen size
  private boolean powerOn = false; //a boolean inicating if the power is on
  private int channel = 0; //integer value of the channel the tv is on
  private int volume = 0; //int value of the volume the tv is set at
  
  /**Constructor for the television class
    * @param brand the make of the television
    * @param size the size of the teleision
    * The constuctor also sets the power off, the channel to 2 and the volume to 20
    */
  public Television(String brand, int size)
  {
    MANUFACTURER = brand;
    SCREEN_SIZE = size;
    powerOn = false;
    channel = 2;
    volume = 20;
  }
  
  public int getVolume()
  {
    return volume;
  }
  
  public int getChannel()
  {
    return channel;
  }
  
  public String getManufacturer()
  {
    return MANUFACTURER;
  }
  
  public int getScreenSize()
  {
    return SCREEN_SIZE;
  }
  
  public void setChannel(int c)
  {
    channel = c;
  }
  
  public void power()
  {
    powerOn = !powerOn;
  }
  
  public void increaseVolume()
  {
    volume++;
  }
  
  public void decreaseVolume()
  {
    volume--;
  }
  
}