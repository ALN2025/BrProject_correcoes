// Bytecode for: ext.mods.gameserver.model.zone.type.subtype.SpawnZoneType
// File: ext\mods\gameserver\model\zone\type\subtype\SpawnZoneType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType.class
  Last modified 9 de jul de 2026; size 2586 bytes
  MD5 checksum ae211cc2cc76addfb55065062b8d7179
  Compiled from "SpawnZoneType.java"
public abstract class ext.mods.gameserver.model.zone.type.subtype.SpawnZoneType extends ext.mods.gameserver.model.zone.type.subtype.ZoneType
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #15                         // ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  interfaces: 0, fields: 1, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
    #2 = Class              #4            // ext/mods/gameserver/model/zone/type/subtype/ZoneType
    #3 = NameAndType        #5:#6         // "<init>":(I)V
    #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
    #5 = Utf8               <init>
    #6 = Utf8               (I)V
    #7 = Class              #8            // java/util/EnumMap
    #8 = Utf8               java/util/EnumMap
    #9 = Class              #10           // ext/mods/gameserver/enums/SpawnType
   #10 = Utf8               ext/mods/gameserver/enums/SpawnType
   #11 = Methodref          #7.#12        // java/util/EnumMap."<init>":(Ljava/lang/Class;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/Class;)V
   #13 = Utf8               (Ljava/lang/Class;)V
   #14 = Fieldref           #15.#16       // ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType._spawns:Ljava/util/Map;
   #15 = Class              #17           // ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType
   #16 = NameAndType        #18:#19       // _spawns:Ljava/util/Map;
   #17 = Utf8               ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType
   #18 = Utf8               _spawns
   #19 = Utf8               Ljava/util/Map;
   #20 = InvokeDynamic      #0:#21        // #0:apply:()Ljava/util/function/Function;
   #21 = NameAndType        #22:#23       // apply:()Ljava/util/function/Function;
   #22 = Utf8               apply
   #23 = Utf8               ()Ljava/util/function/Function;
   #24 = InterfaceMethodref #25.#26       // java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #25 = Class              #27           // java/util/Map
   #26 = NameAndType        #28:#29       // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #27 = Utf8               java/util/Map
   #28 = Utf8               computeIfAbsent
   #29 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #30 = Class              #31           // java/util/List
   #31 = Utf8               java/util/List
   #32 = InterfaceMethodref #30.#33       // java/util/List.add:(Ljava/lang/Object;)Z
   #33 = NameAndType        #34:#35       // add:(Ljava/lang/Object;)Z
   #34 = Utf8               add
   #35 = Utf8               (Ljava/lang/Object;)Z
   #36 = Fieldref           #9.#37        // ext/mods/gameserver/enums/SpawnType.NORMAL:Lext/mods/gameserver/enums/SpawnType;
   #37 = NameAndType        #38:#39       // NORMAL:Lext/mods/gameserver/enums/SpawnType;
   #38 = Utf8               NORMAL
   #39 = Utf8               Lext/mods/gameserver/enums/SpawnType;
   #40 = InterfaceMethodref #25.#41       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #41 = NameAndType        #42:#43       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #42 = Utf8               get
   #43 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #44 = InterfaceMethodref #25.#45       // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #45 = NameAndType        #46:#47       // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #46 = Utf8               getOrDefault
   #47 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #48 = Methodref          #15.#49       // ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType.getSpawns:(Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
   #49 = NameAndType        #50:#51       // getSpawns:(Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
   #50 = Utf8               getSpawns
   #51 = Utf8               (Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
   #52 = Methodref          #53.#54       // ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
   #53 = Class              #55           // ext/mods/commons/random/Rnd
   #54 = NameAndType        #42:#56       // get:(Ljava/util/List;)Ljava/lang/Object;
   #55 = Utf8               ext/mods/commons/random/Rnd
   #56 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
   #57 = Class              #58           // ext/mods/gameserver/model/location/Location
   #58 = Utf8               ext/mods/gameserver/model/location/Location
   #59 = Class              #60           // java/util/ArrayList
   #60 = Utf8               java/util/ArrayList
   #61 = Methodref          #59.#62       // java/util/ArrayList."<init>":()V
   #62 = NameAndType        #5:#63        // "<init>":()V
   #63 = Utf8               ()V
   #64 = Utf8               Signature
   #65 = Utf8               Ljava/util/Map<Lext/mods/gameserver/enums/SpawnType;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;>;
   #66 = Utf8               Code
   #67 = Utf8               LineNumberTable
   #68 = Utf8               LocalVariableTable
   #69 = Utf8               this
   #70 = Utf8               Lext/mods/gameserver/model/zone/type/subtype/SpawnZoneType;
   #71 = Utf8               id
   #72 = Utf8               I
   #73 = Utf8               addSpawn
   #74 = Utf8               (Lext/mods/gameserver/enums/SpawnType;Lext/mods/gameserver/model/location/Location;)V
   #75 = Utf8               type
   #76 = Utf8               loc
   #77 = Utf8               Lext/mods/gameserver/model/location/Location;
   #78 = Utf8               (Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
   #79 = Utf8               getRndSpawn
   #80 = Utf8               (Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
   #81 = Utf8               lambda$addSpawn$0
   #82 = Utf8               k
   #83 = Utf8               SourceFile
   #84 = Utf8               SpawnZoneType.java
   #85 = Utf8               BootstrapMethods
   #86 = MethodType         #43           //  (Ljava/lang/Object;)Ljava/lang/Object;
   #87 = MethodHandle       6:#88         // REF_invokeStatic ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType.lambda$addSpawn$0:(Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
   #88 = Methodref          #15.#89       // ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType.lambda$addSpawn$0:(Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
   #89 = NameAndType        #81:#51       // lambda$addSpawn$0:(Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
   #90 = MethodType         #51           //  (Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
   #91 = MethodHandle       6:#92         // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #92 = Methodref          #93.#94       // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #93 = Class              #95           // java/lang/invoke/LambdaMetafactory
   #94 = NameAndType        #96:#97       // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #95 = Utf8               java/lang/invoke/LambdaMetafactory
   #96 = Utf8               metafactory
   #97 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #98 = Utf8               InnerClasses
   #99 = Class              #100          // java/lang/invoke/MethodHandles$Lookup
  #100 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #101 = Class              #102          // java/lang/invoke/MethodHandles
  #102 = Utf8               java/lang/invoke/MethodHandles
  #103 = Utf8               Lookup
{
  protected ext.mods.gameserver.model.zone.type.subtype.SpawnZoneType(int);
    descriptor: (I)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
         5: aload_0
         6: new           #7                  // class java/util/EnumMap
         9: dup
        10: ldc           #9                  // class ext/mods/gameserver/enums/SpawnType
        12: invokespecial #11                 // Method java/util/EnumMap."<init>":(Ljava/lang/Class;)V
        15: putfield      #14                 // Field _spawns:Ljava/util/Map;
        18: return
      LineNumberTable:
        line 39: 0
        line 35: 5
        line 40: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/zone/type/subtype/SpawnZoneType;
            0      19     1    id   I

  public final void addSpawn(ext.mods.gameserver.enums.SpawnType, ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/enums/SpawnType;Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #14                 // Field _spawns:Ljava/util/Map;
         4: aload_1
         5: invokedynamic #20,  0             // InvokeDynamic #0:apply:()Ljava/util/function/Function;
        10: invokeinterface #24,  3           // InterfaceMethod java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
        15: checkcast     #30                 // class java/util/List
        18: aload_2
        19: invokeinterface #32,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        24: pop
        25: return
      LineNumberTable:
        line 51: 0
        line 52: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/zone/type/subtype/SpawnZoneType;
            0      26     1  type   Lext/mods/gameserver/enums/SpawnType;
            0      26     2   loc   Lext/mods/gameserver/model/location/Location;

  public final java.util.List<ext.mods.gameserver.model.location.Location> getSpawns(ext.mods.gameserver.enums.SpawnType);
    descriptor: (Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #14                 // Field _spawns:Ljava/util/Map;
         4: aload_1
         5: aload_0
         6: getfield      #14                 // Field _spawns:Ljava/util/Map;
         9: getstatic     #36                 // Field ext/mods/gameserver/enums/SpawnType.NORMAL:Lext/mods/gameserver/enums/SpawnType;
        12: invokeinterface #40,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        17: checkcast     #30                 // class java/util/List
        20: invokeinterface #44,  3           // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        25: checkcast     #30                 // class java/util/List
        28: areturn
      LineNumberTable:
        line 60: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/zone/type/subtype/SpawnZoneType;
            0      29     1  type   Lext/mods/gameserver/enums/SpawnType;
    Signature: #78                          // (Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;

  public final ext.mods.gameserver.model.location.Location getRndSpawn(ext.mods.gameserver.enums.SpawnType);
    descriptor: (Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #48                 // Method getSpawns:(Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
         5: invokestatic  #52                 // Method ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
         8: checkcast     #57                 // class ext/mods/gameserver/model/location/Location
        11: areturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/zone/type/subtype/SpawnZoneType;
            0      12     1  type   Lext/mods/gameserver/enums/SpawnType;
}
SourceFile: "SpawnZoneType.java"
BootstrapMethods:
  0: #91 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #86 (Ljava/lang/Object;)Ljava/lang/Object;
      #87 REF_invokeStatic ext/mods/gameserver/model/zone/type/subtype/SpawnZoneType.lambda$addSpawn$0:(Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
      #90 (Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
InnerClasses:
  public static final #103= #99 of #101;  // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
