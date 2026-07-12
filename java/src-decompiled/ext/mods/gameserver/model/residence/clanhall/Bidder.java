// Bytecode for: ext.mods.gameserver.model.residence.clanhall.Bidder
// File: ext\mods\gameserver\model\residence\clanhall\Bidder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/residence/clanhall/Bidder.class
  Last modified 9 de jul de 2026; size 762 bytes
  MD5 checksum bc2f52d3503a36b9f96526b194ad7a4d
  Compiled from "Bidder.java"
public class ext.mods.gameserver.model.residence.clanhall.Bidder extends ext.mods.gameserver.model.residence.clanhall.Seller
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/residence/clanhall/Bidder
  super_class: #2                         // ext/mods/gameserver/model/residence/clanhall/Seller
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/residence/clanhall/Seller."<init>":(Ljava/lang/String;Ljava/lang/String;I)V
   #2 = Class              #4             // ext/mods/gameserver/model/residence/clanhall/Seller
   #3 = NameAndType        #5:#6          // "<init>":(Ljava/lang/String;Ljava/lang/String;I)V
   #4 = Utf8               ext/mods/gameserver/model/residence/clanhall/Seller
   #5 = Utf8               <init>
   #6 = Utf8               (Ljava/lang/String;Ljava/lang/String;I)V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/residence/clanhall/Bidder._time:J
   #8 = Class              #10            // ext/mods/gameserver/model/residence/clanhall/Bidder
   #9 = NameAndType        #11:#12        // _time:J
  #10 = Utf8               ext/mods/gameserver/model/residence/clanhall/Bidder
  #11 = Utf8               _time
  #12 = Utf8               J
  #13 = Utf8               (Ljava/lang/String;Ljava/lang/String;IJ)V
  #14 = Utf8               Code
  #15 = Utf8               LineNumberTable
  #16 = Utf8               LocalVariableTable
  #17 = Utf8               this
  #18 = Utf8               Lext/mods/gameserver/model/residence/clanhall/Bidder;
  #19 = Utf8               name
  #20 = Utf8               Ljava/lang/String;
  #21 = Utf8               clanName
  #22 = Utf8               bid
  #23 = Utf8               I
  #24 = Utf8               time
  #25 = Utf8               getTime
  #26 = Utf8               ()J
  #27 = Utf8               setTime
  #28 = Utf8               (J)V
  #29 = Utf8               SourceFile
  #30 = Utf8               Bidder.java
{
  public ext.mods.gameserver.model.residence.clanhall.Bidder(java.lang.String, java.lang.String, int, long);
    descriptor: (Ljava/lang/String;Ljava/lang/String;IJ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=5
         0: aload_0
         1: aload_1
         2: aload_2
         3: iload_3
         4: invokespecial #1                  // Method ext/mods/gameserver/model/residence/clanhall/Seller."<init>":(Ljava/lang/String;Ljava/lang/String;I)V
         7: aload_0
         8: lload         4
        10: putfield      #7                  // Field _time:J
        13: return
      LineNumberTable:
        line 31: 0
        line 33: 7
        line 34: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/residence/clanhall/Bidder;
            0      14     1  name   Ljava/lang/String;
            0      14     2 clanName   Ljava/lang/String;
            0      14     3   bid   I
            0      14     4  time   J

  public long getTime();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _time:J
         4: lreturn
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/Bidder;

  public void setTime(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: putfield      #7                  // Field _time:J
         5: return
      LineNumberTable:
        line 43: 0
        line 44: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/residence/clanhall/Bidder;
            0       6     1  time   J
}
SourceFile: "Bidder.java"
