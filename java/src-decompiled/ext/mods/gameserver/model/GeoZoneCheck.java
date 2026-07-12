// Bytecode for: ext.mods.gameserver.model.GeoZoneCheck
// File: ext\mods\gameserver\model\GeoZoneCheck.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/GeoZoneCheck.class
  Last modified 9 de jul de 2026; size 1112 bytes
  MD5 checksum 562e519828fa1caeda6e60a8f905754a
  Compiled from "GeoZoneCheck.java"
public class ext.mods.gameserver.model.GeoZoneCheck
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #45                         // ext/mods/gameserver/model/GeoZoneCheck
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #8 = Class              #10            // ext/mods/gameserver/model/World
   #9 = NameAndType        #11:#12        // getInstance:()Lext/mods/gameserver/model/World;
  #10 = Utf8               ext/mods/gameserver/model/World
  #11 = Utf8               getInstance
  #12 = Utf8               ()Lext/mods/gameserver/model/World;
  #13 = Methodref          #8.#14         // ext/mods/gameserver/model/World.getAroundCharacters:(IIII)Ljava/util/List;
  #14 = NameAndType        #15:#16        // getAroundCharacters:(IIII)Ljava/util/List;
  #15 = Utf8               getAroundCharacters
  #16 = Utf8               (IIII)Ljava/util/List;
  #17 = InterfaceMethodref #18.#19        // java/util/List.iterator:()Ljava/util/Iterator;
  #18 = Class              #20            // java/util/List
  #19 = NameAndType        #21:#22        // iterator:()Ljava/util/Iterator;
  #20 = Utf8               java/util/List
  #21 = Utf8               iterator
  #22 = Utf8               ()Ljava/util/Iterator;
  #23 = InterfaceMethodref #24.#25        // java/util/Iterator.hasNext:()Z
  #24 = Class              #26            // java/util/Iterator
  #25 = NameAndType        #27:#28        // hasNext:()Z
  #26 = Utf8               java/util/Iterator
  #27 = Utf8               hasNext
  #28 = Utf8               ()Z
  #29 = InterfaceMethodref #24.#30        // java/util/Iterator.next:()Ljava/lang/Object;
  #30 = NameAndType        #31:#32        // next:()Ljava/lang/Object;
  #31 = Utf8               next
  #32 = Utf8               ()Ljava/lang/Object;
  #33 = Class              #34            // ext/mods/gameserver/model/actor/Creature
  #34 = Utf8               ext/mods/gameserver/model/actor/Creature
  #35 = Fieldref           #36.#37        // ext/mods/gameserver/enums/ZoneId.COLISION:Lext/mods/gameserver/enums/ZoneId;
  #36 = Class              #38            // ext/mods/gameserver/enums/ZoneId
  #37 = NameAndType        #39:#40        // COLISION:Lext/mods/gameserver/enums/ZoneId;
  #38 = Utf8               ext/mods/gameserver/enums/ZoneId
  #39 = Utf8               COLISION
  #40 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #41 = Methodref          #33.#42        // ext/mods/gameserver/model/actor/Creature.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #42 = NameAndType        #43:#44        // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #43 = Utf8               isInsideZone
  #44 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #45 = Class              #46            // ext/mods/gameserver/model/GeoZoneCheck
  #46 = Utf8               ext/mods/gameserver/model/GeoZoneCheck
  #47 = Utf8               Code
  #48 = Utf8               LineNumberTable
  #49 = Utf8               LocalVariableTable
  #50 = Utf8               this
  #51 = Utf8               Lext/mods/gameserver/model/GeoZoneCheck;
  #52 = Utf8               isCollisionFree
  #53 = Utf8               (II)Z
  #54 = Utf8               creature
  #55 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #56 = Utf8               x
  #57 = Utf8               I
  #58 = Utf8               y
  #59 = Utf8               StackMapTable
  #60 = Utf8               SourceFile
  #61 = Utf8               GeoZoneCheck.java
{
  public ext.mods.gameserver.model.GeoZoneCheck();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/GeoZoneCheck;

  public static boolean isCollisionFree(int, int);
    descriptor: (II)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=4, args_size=2
         0: invokestatic  #7                  // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         3: iload_0
         4: iload_1
         5: sipush        150
         8: sipush        200
        11: invokevirtual #13                 // Method ext/mods/gameserver/model/World.getAroundCharacters:(IIII)Ljava/util/List;
        14: invokeinterface #17,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        19: astore_2
        20: aload_2
        21: invokeinterface #23,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        26: ifeq          58
        29: aload_2
        30: invokeinterface #29,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        35: checkcast     #33                 // class ext/mods/gameserver/model/actor/Creature
        38: astore_3
        39: aload_3
        40: ifnull        55
        43: aload_3
        44: getstatic     #35                 // Field ext/mods/gameserver/enums/ZoneId.COLISION:Lext/mods/gameserver/enums/ZoneId;
        47: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Creature.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        50: ifeq          55
        53: iconst_1
        54: ireturn
        55: goto          20
        58: iconst_0
        59: ireturn
      LineNumberTable:
        line 27: 0
        line 29: 39
        line 31: 53
        line 33: 55
        line 34: 58
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39      16     3 creature   Lext/mods/gameserver/model/actor/Creature;
            0      60     0     x   I
            0      60     1     y   I
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/util/Iterator ]
        frame_type = 34 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
}
SourceFile: "GeoZoneCheck.java"
