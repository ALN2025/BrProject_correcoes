// Bytecode for: ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmOpen
// File: ext\mods\gameserver\model\entity\autofarm\zone\AutoFarmOpen.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmOpen.class
  Last modified 9 de jul de 2026; size 2832 bytes
  MD5 checksum 1b80a778cf880083a29d57944f0e519c
  Compiled from "AutoFarmOpen.java"
public class ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmOpen extends ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmArea
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmOpen
  super_class: #10                        // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
  interfaces: 0, fields: 0, methods: 4, attributes: 3
Constant pool:
    #1 = String             #2            // Open
    #2 = Utf8               Open
    #3 = Fieldref           #4.#5         // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
    #4 = Class              #6            // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
    #5 = NameAndType        #7:#8         // OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
    #6 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
    #7 = Utf8               OPEN
    #8 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
    #9 = Methodref          #10.#11       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea."<init>":(ILjava/lang/String;ILext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
   #10 = Class              #12           // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
   #11 = NameAndType        #13:#14       // "<init>":(ILjava/lang/String;ILext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
   #12 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
   #13 = Utf8               <init>
   #14 = Utf8               (ILjava/lang/String;ILext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
   #15 = Methodref          #16.#17       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmOpen.getOwner:()Lext/mods/gameserver/model/actor/Player;
   #16 = Class              #18           // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmOpen
   #17 = NameAndType        #19:#20       // getOwner:()Lext/mods/gameserver/model/actor/Player;
   #18 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmOpen
   #19 = Utf8               getOwner
   #20 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #21 = Class              #22           // ext/mods/gameserver/model/actor/instance/Monster
   #22 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
   #23 = Methodref          #16.#24       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmOpen.getProfile:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
   #24 = NameAndType        #25:#26       // getProfile:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
   #25 = Utf8               getProfile
   #26 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getFinalRadius:()I
   #28 = Class              #30           // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
   #29 = NameAndType        #31:#32       // getFinalRadius:()I
   #30 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
   #31 = Utf8               getFinalRadius
   #32 = Utf8               ()I
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/actor/Player.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #34 = Class              #36           // ext/mods/gameserver/model/actor/Player
   #35 = NameAndType        #37:#38       // getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #36 = Utf8               ext/mods/gameserver/model/actor/Player
   #37 = Utf8               getKnownTypeInRadius
   #38 = Utf8               (Ljava/lang/Class;I)Ljava/util/List;
   #39 = Fieldref           #16.#40       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmOpen._monsterHistory:Ljava/util/Set;
   #40 = NameAndType        #41:#42       // _monsterHistory:Ljava/util/Set;
   #41 = Utf8               _monsterHistory
   #42 = Utf8               Ljava/util/Set;
   #43 = Methodref          #16.#44       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmOpen.getMonsters:()Ljava/util/List;
   #44 = NameAndType        #45:#46       // getMonsters:()Ljava/util/List;
   #45 = Utf8               getMonsters
   #46 = Utf8               ()Ljava/util/List;
   #47 = InterfaceMethodref #48.#49       // java/util/List.stream:()Ljava/util/stream/Stream;
   #48 = Class              #50           // java/util/List
   #49 = NameAndType        #51:#52       // stream:()Ljava/util/stream/Stream;
   #50 = Utf8               java/util/List
   #51 = Utf8               stream
   #52 = Utf8               ()Ljava/util/stream/Stream;
   #53 = InvokeDynamic      #0:#54        // #0:apply:()Ljava/util/function/Function;
   #54 = NameAndType        #55:#56       // apply:()Ljava/util/function/Function;
   #55 = Utf8               apply
   #56 = Utf8               ()Ljava/util/function/Function;
   #57 = InterfaceMethodref #58.#59       // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #58 = Class              #60           // java/util/stream/Stream
   #59 = NameAndType        #61:#62       // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #60 = Utf8               java/util/stream/Stream
   #61 = Utf8               map
   #62 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #63 = InterfaceMethodref #58.#64       // java/util/stream/Stream.toList:()Ljava/util/List;
   #64 = NameAndType        #65:#46       // toList:()Ljava/util/List;
   #65 = Utf8               toList
   #66 = InterfaceMethodref #67.#68       // java/util/Set.addAll:(Ljava/util/Collection;)Z
   #67 = Class              #69           // java/util/Set
   #68 = NameAndType        #70:#71       // addAll:(Ljava/util/Collection;)Z
   #69 = Utf8               java/util/Set
   #70 = Utf8               addAll
   #71 = Utf8               (Ljava/util/Collection;)Z
   #72 = Utf8               (I)V
   #73 = Utf8               Code
   #74 = Utf8               LineNumberTable
   #75 = Utf8               LocalVariableTable
   #76 = Utf8               this
   #77 = Utf8               Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmOpen;
   #78 = Utf8               ownerId
   #79 = Utf8               I
   #80 = Utf8               Signature
   #81 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Monster;>;
   #82 = Utf8               getMonsterHistory
   #83 = Utf8               ()Ljava/util/Set;
   #84 = Utf8               ()Ljava/util/Set<Ljava/lang/String;>;
   #85 = Utf8               visualizeZone
   #86 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
   #87 = Utf8               debug
   #88 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
   #89 = Utf8               SourceFile
   #90 = Utf8               AutoFarmOpen.java
   #91 = Utf8               BootstrapMethods
   #92 = MethodType         #93           //  (Ljava/lang/Object;)Ljava/lang/Object;
   #93 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #94 = MethodHandle       5:#95         // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.getName:()Ljava/lang/String;
   #95 = Methodref          #96.#97       // ext/mods/gameserver/model/WorldObject.getName:()Ljava/lang/String;
   #96 = Class              #98           // ext/mods/gameserver/model/WorldObject
   #97 = NameAndType        #99:#100      // getName:()Ljava/lang/String;
   #98 = Utf8               ext/mods/gameserver/model/WorldObject
   #99 = Utf8               getName
  #100 = Utf8               ()Ljava/lang/String;
  #101 = MethodType         #102          //  (Lext/mods/gameserver/model/actor/instance/Monster;)Ljava/lang/String;
  #102 = Utf8               (Lext/mods/gameserver/model/actor/instance/Monster;)Ljava/lang/String;
  #103 = MethodHandle       6:#104        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #104 = Methodref          #105.#106     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #105 = Class              #107          // java/lang/invoke/LambdaMetafactory
  #106 = NameAndType        #108:#109     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #107 = Utf8               java/lang/invoke/LambdaMetafactory
  #108 = Utf8               metafactory
  #109 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #110 = Utf8               InnerClasses
  #111 = Class              #112          // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #112 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #113 = Utf8               AutoFarmType
  #114 = Class              #115          // java/lang/invoke/MethodHandles$Lookup
  #115 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #116 = Class              #117          // java/lang/invoke/MethodHandles
  #117 = Utf8               java/lang/invoke/MethodHandles
  #118 = Utf8               Lookup
{
  public ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmOpen(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: iconst_1
         2: ldc           #1                  // String Open
         4: iload_1
         5: getstatic     #3                  // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
         8: invokespecial #9                  // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea."<init>":(ILjava/lang/String;ILext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
        11: return
      LineNumberTable:
        line 31: 0
        line 32: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmOpen;
            0      12     1 ownerId   I

  public java.util.List<ext.mods.gameserver.model.actor.instance.Monster> getMonsters();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #15                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
         4: ldc           #21                 // class ext/mods/gameserver/model/actor/instance/Monster
         6: aload_0
         7: invokevirtual #23                 // Method getProfile:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        10: invokevirtual #27                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getFinalRadius:()I
        13: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
        16: areturn
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmOpen;
    Signature: #81                          // ()Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Monster;>;

  public java.util.Set<java.lang.String> getMonsterHistory();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _monsterHistory:Ljava/util/Set;
         4: aload_0
         5: invokevirtual #43                 // Method getMonsters:()Ljava/util/List;
         8: invokeinterface #47,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        13: invokedynamic #53,  0             // InvokeDynamic #0:apply:()Ljava/util/function/Function;
        18: invokeinterface #57,  2           // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        23: invokeinterface #63,  1           // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        28: invokeinterface #66,  2           // InterfaceMethod java/util/Set.addAll:(Ljava/util/Collection;)Z
        33: pop
        34: aload_0
        35: getfield      #39                 // Field _monsterHistory:Ljava/util/Set;
        38: areturn
      LineNumberTable:
        line 43: 0
        line 44: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmOpen;
    Signature: #84                          // ()Ljava/util/Set<Ljava/lang/String;>;

  public void visualizeZone(ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 50: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmOpen;
            0       1     1 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
}
SourceFile: "AutoFarmOpen.java"
BootstrapMethods:
  0: #103 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #92 (Ljava/lang/Object;)Ljava/lang/Object;
      #94 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.getName:()Ljava/lang/String;
      #101 (Lext/mods/gameserver/model/actor/instance/Monster;)Ljava/lang/String;
InnerClasses:
  public static final #113= #4 of #111;   // AutoFarmType=class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType of class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  public static final #118= #114 of #116; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
