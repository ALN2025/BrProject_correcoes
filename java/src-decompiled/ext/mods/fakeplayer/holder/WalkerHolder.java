// Bytecode for: ext.mods.fakeplayer.holder.WalkerHolder
// File: ext\mods\fakeplayer\holder\WalkerHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/holder/WalkerHolder.class
  Last modified 9 de jul de 2026; size 1570 bytes
  MD5 checksum bf24e57799cef787a365db2ef36f03b1
  Compiled from "WalkerHolder.java"
public class ext.mods.fakeplayer.holder.WalkerHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/fakeplayer/holder/WalkerHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 5, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/fakeplayer/holder/WalkerHolder.CITIES_WAYPOINTS:Ljava/util/Map;
   #8 = Class              #10            // ext/mods/fakeplayer/holder/WalkerHolder
   #9 = NameAndType        #11:#12        // CITIES_WAYPOINTS:Ljava/util/Map;
  #10 = Utf8               ext/mods/fakeplayer/holder/WalkerHolder
  #11 = Utf8               CITIES_WAYPOINTS
  #12 = Utf8               Ljava/util/Map;
  #13 = InterfaceMethodref #14.#15        // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #14 = Class              #16            // java/util/Map
  #15 = NameAndType        #17:#18        // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #16 = Utf8               java/util/Map
  #17 = Utf8               put
  #18 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #19 = InterfaceMethodref #14.#20        // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #20 = NameAndType        #21:#22        // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #21 = Utf8               get
  #22 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #23 = Class              #24            // java/util/List
  #24 = Utf8               java/util/List
  #25 = Class              #26            // java/util/HashMap
  #26 = Utf8               java/util/HashMap
  #27 = Methodref          #25.#3         // java/util/HashMap."<init>":()V
  #28 = Utf8               Signature
  #29 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;>;
  #30 = Utf8               Code
  #31 = Utf8               LineNumberTable
  #32 = Utf8               LocalVariableTable
  #33 = Utf8               this
  #34 = Utf8               Lext/mods/fakeplayer/holder/WalkerHolder;
  #35 = Utf8               addCityWaypoints
  #36 = Utf8               (Ljava/lang/String;Ljava/util/List;)V
  #37 = Utf8               cityName
  #38 = Utf8               Ljava/lang/String;
  #39 = Utf8               waypoints
  #40 = Utf8               Ljava/util/List;
  #41 = Utf8               LocalVariableTypeTable
  #42 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #43 = Utf8               (Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;)V
  #44 = Utf8               getCityWaypoints
  #45 = Utf8               (Ljava/lang/String;)Ljava/util/List;
  #46 = Utf8               (Ljava/lang/String;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #47 = Utf8               getAllWaypoints
  #48 = Utf8               ()Ljava/util/Map;
  #49 = Utf8               ()Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;>;
  #50 = Utf8               <clinit>
  #51 = Utf8               SourceFile
  #52 = Utf8               WalkerHolder.java
{
  public ext.mods.fakeplayer.holder.WalkerHolder();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/holder/WalkerHolder;

  public static void addCityWaypoints(java.lang.String, java.util.List<ext.mods.gameserver.model.location.Location>);
    descriptor: (Ljava/lang/String;Ljava/util/List;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=2, args_size=2
         0: getstatic     #7                  // Field CITIES_WAYPOINTS:Ljava/util/Map;
         3: aload_0
         4: aload_1
         5: invokeinterface #13,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        10: pop
        11: return
      LineNumberTable:
        line 32: 0
        line 33: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0 cityName   Ljava/lang/String;
            0      12     1 waypoints   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      12     1 waypoints   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
    Signature: #43                          // (Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;)V

  public static java.util.List<ext.mods.gameserver.model.location.Location> getCityWaypoints(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #7                  // Field CITIES_WAYPOINTS:Ljava/util/Map;
         3: aload_0
         4: invokeinterface #19,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
         9: checkcast     #23                 // class java/util/List
        12: areturn
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0 cityName   Ljava/lang/String;
    Signature: #46                          // (Ljava/lang/String;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;

  public static java.util.Map<java.lang.String, java.util.List<ext.mods.gameserver.model.location.Location>> getAllWaypoints();
    descriptor: ()Ljava/util/Map;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #7                  // Field CITIES_WAYPOINTS:Ljava/util/Map;
         3: areturn
      LineNumberTable:
        line 42: 0
    Signature: #49                          // ()Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;>;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #25                 // class java/util/HashMap
         3: dup
         4: invokespecial #27                 // Method java/util/HashMap."<init>":()V
         7: putstatic     #7                  // Field CITIES_WAYPOINTS:Ljava/util/Map;
        10: return
      LineNumberTable:
        line 28: 0
}
SourceFile: "WalkerHolder.java"
