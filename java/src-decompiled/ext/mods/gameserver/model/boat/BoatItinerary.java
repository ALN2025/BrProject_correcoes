// Bytecode for: ext.mods.gameserver.model.boat.BoatItinerary
// File: ext\mods\gameserver\model\boat\BoatItinerary.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/boat/BoatItinerary.class
  Last modified 9 de jul de 2026; size 1748 bytes
  MD5 checksum c94944527bd228851d64b849da237c59
  Compiled from "BoatItinerary.java"
public class ext.mods.gameserver.model.boat.BoatItinerary
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #10                         // ext/mods/gameserver/model/boat/BoatItinerary
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 5, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/gameserver/model/boat/BoatRouteInfo
   #8 = Utf8               ext/mods/gameserver/model/boat/BoatRouteInfo
   #9 = Fieldref           #10.#11        // ext/mods/gameserver/model/boat/BoatItinerary._info:[Lext/mods/gameserver/model/boat/BoatRouteInfo;
  #10 = Class              #12            // ext/mods/gameserver/model/boat/BoatItinerary
  #11 = NameAndType        #13:#14        // _info:[Lext/mods/gameserver/model/boat/BoatRouteInfo;
  #12 = Utf8               ext/mods/gameserver/model/boat/BoatItinerary
  #13 = Utf8               _info
  #14 = Utf8               [Lext/mods/gameserver/model/boat/BoatRouteInfo;
  #15 = Methodref          #7.#16         // ext/mods/gameserver/model/boat/BoatRouteInfo."<init>":([Lext/mods/gameserver/model/location/BoatLocation;Lext/mods/gameserver/enums/boats/BoatDock;I)V
  #16 = NameAndType        #5:#17         // "<init>":([Lext/mods/gameserver/model/location/BoatLocation;Lext/mods/gameserver/enums/boats/BoatDock;I)V
  #17 = Utf8               ([Lext/mods/gameserver/model/location/BoatLocation;Lext/mods/gameserver/enums/boats/BoatDock;I)V
  #18 = Fieldref           #10.#19        // ext/mods/gameserver/model/boat/BoatItinerary._heading:I
  #19 = NameAndType        #20:#21        // _heading:I
  #20 = Utf8               _heading
  #21 = Utf8               I
  #22 = Methodref          #7.#23         // ext/mods/gameserver/model/boat/BoatRouteInfo.visualize:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #23 = NameAndType        #24:#25        // visualize:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #24 = Utf8               visualize
  #25 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #26 = Methodref          #10.#27        // ext/mods/gameserver/model/boat/BoatItinerary.isOneWay:()Z
  #27 = NameAndType        #28:#29        // isOneWay:()Z
  #28 = Utf8               isOneWay
  #29 = Utf8               ()Z
  #30 = Utf8               (Lext/mods/gameserver/enums/boats/BoatDock;Lext/mods/gameserver/enums/boats/BoatDock;III[[Lext/mods/gameserver/model/location/BoatLocation;)V
  #31 = Utf8               Code
  #32 = Utf8               LineNumberTable
  #33 = Utf8               LocalVariableTable
  #34 = Utf8               this
  #35 = Utf8               Lext/mods/gameserver/model/boat/BoatItinerary;
  #36 = Utf8               dock1
  #37 = Utf8               Lext/mods/gameserver/enums/boats/BoatDock;
  #38 = Utf8               dock2
  #39 = Utf8               item1
  #40 = Utf8               item2
  #41 = Utf8               heading
  #42 = Utf8               routes
  #43 = Utf8               [[Lext/mods/gameserver/model/location/BoatLocation;
  #44 = Utf8               StackMapTable
  #45 = Class              #46            // ext/mods/gameserver/enums/boats/BoatDock
  #46 = Utf8               ext/mods/gameserver/enums/boats/BoatDock
  #47 = Class              #43            // "[[Lext/mods/gameserver/model/location/BoatLocation;"
  #48 = Class              #14            // "[Lext/mods/gameserver/model/boat/BoatRouteInfo;"
  #49 = Utf8               getHeading
  #50 = Utf8               ()I
  #51 = Utf8               getInfo
  #52 = Utf8               ()[Lext/mods/gameserver/model/boat/BoatRouteInfo;
  #53 = Utf8               debug
  #54 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #55 = Utf8               SourceFile
  #56 = Utf8               BoatItinerary.java
{
  public ext.mods.gameserver.model.boat.BoatItinerary(ext.mods.gameserver.enums.boats.BoatDock, ext.mods.gameserver.enums.boats.BoatDock, int, int, int, ext.mods.gameserver.model.location.BoatLocation[][]);
    descriptor: (Lext/mods/gameserver/enums/boats/BoatDock;Lext/mods/gameserver/enums/boats/BoatDock;III[[Lext/mods/gameserver/model/location/BoatLocation;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=7
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_2
         6: anewarray     #7                  // class ext/mods/gameserver/model/boat/BoatRouteInfo
         9: putfield      #9                  // Field _info:[Lext/mods/gameserver/model/boat/BoatRouteInfo;
        12: aload_0
        13: getfield      #9                  // Field _info:[Lext/mods/gameserver/model/boat/BoatRouteInfo;
        16: iconst_0
        17: new           #7                  // class ext/mods/gameserver/model/boat/BoatRouteInfo
        20: dup
        21: aload         6
        23: iconst_0
        24: aaload
        25: aload_1
        26: iload_3
        27: invokespecial #15                 // Method ext/mods/gameserver/model/boat/BoatRouteInfo."<init>":([Lext/mods/gameserver/model/location/BoatLocation;Lext/mods/gameserver/enums/boats/BoatDock;I)V
        30: aastore
        31: aload_0
        32: getfield      #9                  // Field _info:[Lext/mods/gameserver/model/boat/BoatRouteInfo;
        35: iconst_1
        36: aload_2
        37: ifnonnull     44
        40: aconst_null
        41: goto          58
        44: new           #7                  // class ext/mods/gameserver/model/boat/BoatRouteInfo
        47: dup
        48: aload         6
        50: iconst_1
        51: aaload
        52: aload_2
        53: iload         4
        55: invokespecial #15                 // Method ext/mods/gameserver/model/boat/BoatRouteInfo."<init>":([Lext/mods/gameserver/model/location/BoatLocation;Lext/mods/gameserver/enums/boats/BoatDock;I)V
        58: aastore
        59: aload_0
        60: iload         5
        62: putfield      #18                 // Field _heading:I
        65: return
      LineNumberTable:
        line 30: 0
        line 26: 4
        line 31: 12
        line 32: 31
        line 34: 59
        line 35: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      66     0  this   Lext/mods/gameserver/model/boat/BoatItinerary;
            0      66     1 dock1   Lext/mods/gameserver/enums/boats/BoatDock;
            0      66     2 dock2   Lext/mods/gameserver/enums/boats/BoatDock;
            0      66     3 item1   I
            0      66     4 item2   I
            0      66     5 heading   I
            0      66     6 routes   [[Lext/mods/gameserver/model/location/BoatLocation;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/boat/BoatItinerary, class ext/mods/gameserver/enums/boats/BoatDock, class ext/mods/gameserver/enums/boats/BoatDock, int, int, int, class "[[Lext/mods/gameserver/model/location/BoatLocation;" ]
          stack = [ class "[Lext/mods/gameserver/model/boat/BoatRouteInfo;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/boat/BoatItinerary, class ext/mods/gameserver/enums/boats/BoatDock, class ext/mods/gameserver/enums/boats/BoatDock, int, int, int, class "[[Lext/mods/gameserver/model/location/BoatLocation;" ]
          stack = [ class "[Lext/mods/gameserver/model/boat/BoatRouteInfo;", int, class ext/mods/gameserver/model/boat/BoatRouteInfo ]

  public int getHeading();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _heading:I
         4: ireturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/boat/BoatItinerary;

  public ext.mods.gameserver.model.boat.BoatRouteInfo[] getInfo();
    descriptor: ()[Lext/mods/gameserver/model/boat/BoatRouteInfo;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #9                  // Field _info:[Lext/mods/gameserver/model/boat/BoatRouteInfo;
         4: areturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/boat/BoatItinerary;

  public boolean isOneWay();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #9                  // Field _info:[Lext/mods/gameserver/model/boat/BoatRouteInfo;
         4: iconst_1
         5: aaload
         6: ifnonnull     13
         9: iconst_1
        10: goto          14
        13: iconst_0
        14: ireturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/boat/BoatItinerary;
      StackMapTable: number_of_entries = 2
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void visualize(ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #9                  // Field _info:[Lext/mods/gameserver/model/boat/BoatRouteInfo;
         4: iconst_0
         5: aaload
         6: aload_1
         7: invokevirtual #22                 // Method ext/mods/gameserver/model/boat/BoatRouteInfo.visualize:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
        10: aload_0
        11: invokevirtual #26                 // Method isOneWay:()Z
        14: ifne          27
        17: aload_0
        18: getfield      #9                  // Field _info:[Lext/mods/gameserver/model/boat/BoatRouteInfo;
        21: iconst_1
        22: aaload
        23: aload_1
        24: invokevirtual #22                 // Method ext/mods/gameserver/model/boat/BoatRouteInfo.visualize:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
        27: return
      LineNumberTable:
        line 54: 0
        line 56: 10
        line 57: 17
        line 58: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/boat/BoatItinerary;
            0      28     1 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
      StackMapTable: number_of_entries = 1
        frame_type = 27 /* same */
}
SourceFile: "BoatItinerary.java"
