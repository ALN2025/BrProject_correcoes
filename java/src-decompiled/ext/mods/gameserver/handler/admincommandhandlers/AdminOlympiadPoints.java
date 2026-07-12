// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminOlympiadPoints
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminOlympiadPoints.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminOlympiadPoints.class
  Last modified 9 de jul de 2026; size 4657 bytes
  MD5 checksum 69759c1201c3ef20b9ab50f20f2092ae
  Compiled from "AdminOlympiadPoints.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminOlympiadPoints implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/handler/admincommandhandlers/AdminOlympiadPoints
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/handler/admincommandhandlers/AdminOlympiadPoints.getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
    #8 = Class              #10           // ext/mods/gameserver/handler/admincommandhandlers/AdminOlympiadPoints
    #9 = NameAndType        #11:#12       // getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #10 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminOlympiadPoints
   #11 = Utf8               getTargetPlayer
   #12 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #13 = String             #14           // admin_addolypoints
   #14 = Utf8               admin_addolypoints
   #15 = Methodref          #16.#17       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #16 = Class              #18           // java/lang/String
   #17 = NameAndType        #19:#20       // startsWith:(Ljava/lang/String;)Z
   #18 = Utf8               java/lang/String
   #19 = Utf8               startsWith
   #20 = Utf8               (Ljava/lang/String;)Z
   #21 = Methodref          #16.#22       // java/lang/String.substring:(I)Ljava/lang/String;
   #22 = NameAndType        #23:#24       // substring:(I)Ljava/lang/String;
   #23 = Utf8               substring
   #24 = Utf8               (I)Ljava/lang/String;
   #25 = Methodref          #26.#27       // ext/mods/gameserver/model/actor/Player.isNoble:()Z
   #26 = Class              #28           // ext/mods/gameserver/model/actor/Player
   #27 = NameAndType        #29:#30       // isNoble:()Z
   #28 = Utf8               ext/mods/gameserver/model/actor/Player
   #29 = Utf8               isNoble
   #30 = Utf8               ()Z
   #31 = Methodref          #32.#33       // ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
   #32 = Class              #34           // ext/mods/gameserver/model/olympiad/Olympiad
   #33 = NameAndType        #35:#36       // getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
   #34 = Utf8               ext/mods/gameserver/model/olympiad/Olympiad
   #35 = Utf8               getInstance
   #36 = Utf8               ()Lext/mods/gameserver/model/olympiad/Olympiad;
   #37 = Methodref          #26.#38       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #38 = NameAndType        #39:#40       // getObjectId:()I
   #39 = Utf8               getObjectId
   #40 = Utf8               ()I
   #41 = Methodref          #32.#42       // ext/mods/gameserver/model/olympiad/Olympiad.getNobleStats:(I)Lext/mods/commons/data/StatSet;
   #42 = NameAndType        #43:#44       // getNobleStats:(I)Lext/mods/commons/data/StatSet;
   #43 = Utf8               getNobleStats
   #44 = Utf8               (I)Lext/mods/commons/data/StatSet;
   #45 = String             #46           // Oops! This player hasn\'t played on Olympiad yet!
   #46 = Utf8               Oops! This player hasn\'t played on Olympiad yet!
   #47 = Methodref          #26.#48       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #48 = NameAndType        #49:#50       // sendMessage:(Ljava/lang/String;)V
   #49 = Utf8               sendMessage
   #50 = Utf8               (Ljava/lang/String;)V
   #51 = Methodref          #32.#52       // ext/mods/gameserver/model/olympiad/Olympiad.getNoblePoints:(I)I
   #52 = NameAndType        #53:#54       // getNoblePoints:(I)I
   #53 = Utf8               getNoblePoints
   #54 = Utf8               (I)I
   #55 = Methodref          #56.#57       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #56 = Class              #58           // java/lang/Integer
   #57 = NameAndType        #59:#60       // parseInt:(Ljava/lang/String;)I
   #58 = Utf8               java/lang/Integer
   #59 = Utf8               parseInt
   #60 = Utf8               (Ljava/lang/String;)I
   #61 = String             #62           // You can\'t set more than 100 or less than 0 Olympiad points!
   #62 = Utf8               You can\'t set more than 100 or less than 0 Olympiad points!
   #63 = String             #64           // olympiad_points
   #64 = Utf8               olympiad_points
   #65 = Methodref          #66.#67       // ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
   #66 = Class              #68           // ext/mods/commons/data/StatSet
   #67 = NameAndType        #69:#70       // set:(Ljava/lang/String;I)V
   #68 = Utf8               ext/mods/commons/data/StatSet
   #69 = Utf8               set
   #70 = Utf8               (Ljava/lang/String;I)V
   #71 = Methodref          #26.#72       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #72 = NameAndType        #73:#74       // getName:()Ljava/lang/String;
   #73 = Utf8               getName
   #74 = Utf8               ()Ljava/lang/String;
   #75 = InvokeDynamic      #0:#76        // #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #76 = NameAndType        #77:#78       // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #77 = Utf8               makeConcatWithConstants
   #78 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
   #79 = String             #80           // Oops! This player is not noblesse!
   #80 = Utf8               Oops! This player is not noblesse!
   #81 = String             #82           // Usage: target a player and write the amount of points you would like to add.
   #82 = Utf8               Usage: target a player and write the amount of points you would like to add.
   #83 = String             #84           // Example: //addolypoints 10
   #84 = Utf8               Example: //addolypoints 10
   #85 = String             #86           // However, keep in mind that you can\'t have less than 0 or more than 100 points.
   #86 = Utf8               However, keep in mind that you can\'t have less than 0 or more than 100 points.
   #87 = String             #88           // admin_removeolypoints
   #88 = Utf8               admin_removeolypoints
   #89 = String             #90           // Usage: target a player and write the amount of points you would like to remove.
   #90 = Utf8               Usage: target a player and write the amount of points you would like to remove.
   #91 = String             #92           // Example: //removeolypoints 10
   #92 = Utf8               Example: //removeolypoints 10
   #93 = String             #94           // admin_setolypoints
   #94 = Utf8               admin_setolypoints
   #95 = String             #96           // You can\'t set more than 100 or less than 0 Olympiad points! or lower then 0
   #96 = Utf8               You can\'t set more than 100 or less than 0 Olympiad points! or lower then 0
   #97 = String             #98           // Usage: target a player and write the amount of points you would like to set.
   #98 = Utf8               Usage: target a player and write the amount of points you would like to set.
   #99 = String             #100          // Example: //setolypoints 10
  #100 = Utf8               Example: //setolypoints 10
  #101 = String             #102          // admin_getolypoints
  #102 = Utf8               admin_getolypoints
  #103 = InvokeDynamic      #1:#104       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #104 = NameAndType        #77:#105      // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #105 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #106 = String             #107          //    Match(s):  0
  #107 = Utf8                  Match(s):  0
  #108 = String             #109          //    Win(s):    0
  #109 = Utf8                  Win(s):    0
  #110 = String             #111          //    Defeat(s): 0
  #111 = Utf8                  Defeat(s): 0
  #112 = String             #113          //    Point(s):  0
  #113 = Utf8                  Point(s):  0
  #114 = String             #115          // competitions_done
  #115 = Utf8               competitions_done
  #116 = Methodref          #66.#117      // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #117 = NameAndType        #118:#60      // getInteger:(Ljava/lang/String;)I
  #118 = Utf8               getInteger
  #119 = InvokeDynamic      #2:#120       // #2:makeConcatWithConstants:(I)Ljava/lang/String;
  #120 = NameAndType        #77:#24       // makeConcatWithConstants:(I)Ljava/lang/String;
  #121 = String             #122          // competitions_won
  #122 = Utf8               competitions_won
  #123 = InvokeDynamic      #3:#120       // #3:makeConcatWithConstants:(I)Ljava/lang/String;
  #124 = String             #125          // competitions_lost
  #125 = Utf8               competitions_lost
  #126 = InvokeDynamic      #4:#120       // #4:makeConcatWithConstants:(I)Ljava/lang/String;
  #127 = InvokeDynamic      #5:#120       // #5:makeConcatWithConstants:(I)Ljava/lang/String;
  #128 = String             #129          // You must target a player to use the command.
  #129 = Utf8               You must target a player to use the command.
  #130 = Fieldref           #8.#131       // ext/mods/gameserver/handler/admincommandhandlers/AdminOlympiadPoints.ADMIN_COMMANDS:[Ljava/lang/String;
  #131 = NameAndType        #132:#133     // ADMIN_COMMANDS:[Ljava/lang/String;
  #132 = Utf8               ADMIN_COMMANDS
  #133 = Utf8               [Ljava/lang/String;
  #134 = Class              #135          // ext/mods/gameserver/handler/IAdminCommandHandler
  #135 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #136 = Utf8               Code
  #137 = Utf8               LineNumberTable
  #138 = Utf8               LocalVariableTable
  #139 = Utf8               this
  #140 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminOlympiadPoints;
  #141 = Utf8               useAdminCommand
  #142 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #143 = Utf8               stat
  #144 = Utf8               Lext/mods/commons/data/StatSet;
  #145 = Utf8               oldpoints
  #146 = Utf8               I
  #147 = Utf8               points
  #148 = Utf8               val
  #149 = Utf8               Ljava/lang/String;
  #150 = Utf8               command
  #151 = Utf8               player
  #152 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #153 = Utf8               targetPlayer
  #154 = Utf8               StackMapTable
  #155 = Utf8               getAdminCommandList
  #156 = Utf8               ()[Ljava/lang/String;
  #157 = Utf8               <clinit>
  #158 = Utf8               SourceFile
  #159 = Utf8               AdminOlympiadPoints.java
  #160 = Utf8               BootstrapMethods
  #161 = String             #162          // Player \u0001 now has \u0001 Olympiad points.
  #162 = Utf8               Player \u0001 now has \u0001 Olympiad points.
  #163 = String             #164          // >=========>>\u0001<<=========
  #164 = Utf8               >=========>>\u0001<<=========
  #165 = String             #166          //    Match(s):  \u0001
  #166 = Utf8                  Match(s):  \u0001
  #167 = String             #168          //    Win(s):    \u0001
  #168 = Utf8                  Win(s):    \u0001
  #169 = String             #170          //    Defeat(s): \u0001
  #170 = Utf8                  Defeat(s): \u0001
  #171 = String             #172          //    Point(s):  \u0001
  #172 = Utf8                  Point(s):  \u0001
  #173 = MethodHandle       6:#174        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #174 = Methodref          #175.#176     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #175 = Class              #177          // java/lang/invoke/StringConcatFactory
  #176 = NameAndType        #77:#178      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #177 = Utf8               java/lang/invoke/StringConcatFactory
  #178 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #179 = Utf8               InnerClasses
  #180 = Class              #181          // java/lang/invoke/MethodHandles$Lookup
  #181 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #182 = Class              #183          // java/lang/invoke/MethodHandles
  #183 = Utf8               java/lang/invoke/MethodHandles
  #184 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminOlympiadPoints();
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
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminOlympiadPoints;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=3
         0: aload_0
         1: aload_2
         2: iconst_1
         3: invokevirtual #7                  // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
         6: astore_3
         7: aload_1
         8: ldc           #13                 // String admin_addolypoints
        10: invokevirtual #15                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        13: ifeq          150
        16: aload_1
        17: bipush        19
        19: invokevirtual #21                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        22: astore        4
        24: aload_3
        25: ifnull        129
        28: aload_2
        29: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
        32: ifeq          122
        35: invokestatic  #31                 // Method ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
        38: aload_2
        39: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        42: invokevirtual #41                 // Method ext/mods/gameserver/model/olympiad/Olympiad.getNobleStats:(I)Lext/mods/commons/data/StatSet;
        45: astore        5
        47: aload         5
        49: ifnonnull     59
        52: aload_2
        53: ldc           #45                 // String Oops! This player hasn\'t played on Olympiad yet!
        55: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        58: return
        59: invokestatic  #31                 // Method ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
        62: aload_2
        63: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        66: invokevirtual #51                 // Method ext/mods/gameserver/model/olympiad/Olympiad.getNoblePoints:(I)I
        69: istore        6
        71: iload         6
        73: aload         4
        75: invokestatic  #55                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        78: iadd
        79: istore        7
        81: iload         7
        83: bipush        100
        85: if_icmple     95
        88: aload_2
        89: ldc           #61                 // String You can\'t set more than 100 or less than 0 Olympiad points!
        91: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        94: return
        95: aload         5
        97: ldc           #63                 // String olympiad_points
        99: iload         7
       101: invokevirtual #65                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       104: aload_2
       105: aload_2
       106: invokevirtual #71                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       109: iload         7
       111: invokedynamic #75,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
       116: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       119: goto          147
       122: aload_2
       123: ldc           #79                 // String Oops! This player is not noblesse!
       125: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       128: return
       129: aload_2
       130: ldc           #81                 // String Usage: target a player and write the amount of points you would like to add.
       132: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       135: aload_2
       136: ldc           #83                 // String Example: //addolypoints 10
       138: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       141: aload_2
       142: ldc           #85                 // String However, keep in mind that you can\'t have less than 0 or more than 100 points.
       144: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       147: goto          596
       150: aload_1
       151: ldc           #87                 // String admin_removeolypoints
       153: invokevirtual #15                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       156: ifeq          287
       159: aload_1
       160: bipush        22
       162: invokevirtual #21                 // Method java/lang/String.substring:(I)Ljava/lang/String;
       165: astore        4
       167: aload_3
       168: ifnull        266
       171: aload_2
       172: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
       175: ifeq          259
       178: invokestatic  #31                 // Method ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
       181: aload_2
       182: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       185: invokevirtual #41                 // Method ext/mods/gameserver/model/olympiad/Olympiad.getNobleStats:(I)Lext/mods/commons/data/StatSet;
       188: astore        5
       190: aload         5
       192: ifnonnull     202
       195: aload_2
       196: ldc           #45                 // String Oops! This player hasn\'t played on Olympiad yet!
       198: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       201: return
       202: invokestatic  #31                 // Method ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
       205: aload_2
       206: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       209: invokevirtual #51                 // Method ext/mods/gameserver/model/olympiad/Olympiad.getNoblePoints:(I)I
       212: istore        6
       214: iload         6
       216: aload         4
       218: invokestatic  #55                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       221: isub
       222: istore        7
       224: iload         7
       226: ifge          232
       229: iconst_0
       230: istore        7
       232: aload         5
       234: ldc           #63                 // String olympiad_points
       236: iload         7
       238: invokevirtual #65                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       241: aload_2
       242: aload_2
       243: invokevirtual #71                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       246: iload         7
       248: invokedynamic #75,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
       253: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       256: goto          284
       259: aload_2
       260: ldc           #79                 // String Oops! This player is not noblesse!
       262: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       265: return
       266: aload_2
       267: ldc           #89                 // String Usage: target a player and write the amount of points you would like to remove.
       269: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       272: aload_2
       273: ldc           #91                 // String Example: //removeolypoints 10
       275: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       278: aload_2
       279: ldc           #85                 // String However, keep in mind that you can\'t have less than 0 or more than 100 points.
       281: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       284: goto          596
       287: aload_1
       288: ldc           #93                 // String admin_setolypoints
       290: invokevirtual #15                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       293: ifeq          426
       296: aload_1
       297: bipush        19
       299: invokevirtual #21                 // Method java/lang/String.substring:(I)Ljava/lang/String;
       302: astore        4
       304: aload_3
       305: ifnull        405
       308: aload_2
       309: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
       312: ifeq          398
       315: invokestatic  #31                 // Method ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
       318: aload_2
       319: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       322: invokevirtual #41                 // Method ext/mods/gameserver/model/olympiad/Olympiad.getNobleStats:(I)Lext/mods/commons/data/StatSet;
       325: astore        5
       327: aload         5
       329: ifnonnull     339
       332: aload_2
       333: ldc           #45                 // String Oops! This player hasn\'t played on Olympiad yet!
       335: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       338: return
       339: aload         4
       341: invokestatic  #55                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       344: iconst_1
       345: if_icmpge     365
       348: aload         4
       350: invokestatic  #55                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       353: bipush        100
       355: if_icmple     365
       358: aload_2
       359: ldc           #95                 // String You can\'t set more than 100 or less than 0 Olympiad points! or lower then 0
       361: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       364: return
       365: aload         5
       367: ldc           #63                 // String olympiad_points
       369: aload         4
       371: invokestatic  #55                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       374: invokevirtual #65                 // Method ext/mods/commons/data/StatSet.set:(Ljava/lang/String;I)V
       377: aload_2
       378: aload_2
       379: invokevirtual #71                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       382: aload         4
       384: invokestatic  #55                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       387: invokedynamic #75,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
       392: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       395: goto          423
       398: aload_2
       399: ldc           #79                 // String Oops! This player is not noblesse!
       401: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       404: return
       405: aload_2
       406: ldc           #97                 // String Usage: target a player and write the amount of points you would like to set.
       408: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       411: aload_2
       412: ldc           #99                 // String Example: //setolypoints 10
       414: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       417: aload_2
       418: ldc           #85                 // String However, keep in mind that you can\'t have less than 0 or more than 100 points.
       420: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       423: goto          596
       426: aload_1
       427: ldc           #101                // String admin_getolypoints
       429: invokevirtual #15                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       432: ifeq          596
       435: aload_3
       436: ifnull        590
       439: aload_2
       440: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
       443: ifeq          583
       446: invokestatic  #31                 // Method ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
       449: aload_2
       450: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       453: invokevirtual #41                 // Method ext/mods/gameserver/model/olympiad/Olympiad.getNobleStats:(I)Lext/mods/commons/data/StatSet;
       456: astore        4
       458: aload_2
       459: aload_2
       460: invokevirtual #71                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       463: invokedynamic #103,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       468: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       471: aload         4
       473: ifnonnull     503
       476: aload_2
       477: ldc           #106                // String    Match(s):  0
       479: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       482: aload_2
       483: ldc           #108                // String    Win(s):    0
       485: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       488: aload_2
       489: ldc           #110                // String    Defeat(s): 0
       491: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       494: aload_2
       495: ldc           #112                // String    Point(s):  0
       497: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       500: goto          580
       503: aload_2
       504: aload         4
       506: ldc           #114                // String competitions_done
       508: invokevirtual #116                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       511: invokedynamic #119,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
       516: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       519: aload_2
       520: aload         4
       522: ldc           #121                // String competitions_won
       524: invokevirtual #116                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       527: invokedynamic #123,  0            // InvokeDynamic #3:makeConcatWithConstants:(I)Ljava/lang/String;
       532: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       535: aload_2
       536: aload         4
       538: ldc           #124                // String competitions_lost
       540: invokevirtual #116                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       543: invokedynamic #126,  0            // InvokeDynamic #4:makeConcatWithConstants:(I)Ljava/lang/String;
       548: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       551: aload_2
       552: aload         4
       554: ldc           #63                 // String olympiad_points
       556: invokevirtual #116                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       559: invokedynamic #127,  0            // InvokeDynamic #5:makeConcatWithConstants:(I)Ljava/lang/String;
       564: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       567: aload_2
       568: aload_2
       569: invokevirtual #71                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       572: invokedynamic #103,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       577: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       580: goto          596
       583: aload_2
       584: ldc           #79                 // String Oops! This player is not noblesse!
       586: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       589: return
       590: aload_2
       591: ldc           #128                // String You must target a player to use the command.
       593: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       596: return
      LineNumberTable:
        line 39: 0
        line 41: 7
        line 43: 16
        line 45: 24
        line 47: 28
        line 49: 35
        line 50: 47
        line 52: 52
        line 53: 58
        line 56: 59
        line 57: 71
        line 58: 81
        line 60: 88
        line 61: 94
        line 64: 95
        line 65: 104
        line 66: 119
        line 69: 122
        line 70: 128
        line 75: 129
        line 76: 135
        line 77: 141
        line 79: 147
        line 80: 150
        line 82: 159
        line 84: 167
        line 86: 171
        line 88: 178
        line 89: 190
        line 91: 195
        line 92: 201
        line 95: 202
        line 96: 214
        line 97: 224
        line 98: 229
        line 100: 232
        line 101: 241
        line 102: 256
        line 105: 259
        line 106: 265
        line 111: 266
        line 112: 272
        line 113: 278
        line 115: 284
        line 116: 287
        line 118: 296
        line 119: 304
        line 121: 308
        line 123: 315
        line 124: 327
        line 126: 332
        line 127: 338
        line 130: 339
        line 132: 358
        line 133: 364
        line 136: 365
        line 137: 377
        line 138: 395
        line 141: 398
        line 142: 404
        line 147: 405
        line 148: 411
        line 149: 417
        line 151: 423
        line 152: 426
        line 154: 435
        line 156: 439
        line 158: 446
        line 159: 458
        line 160: 471
        line 162: 476
        line 163: 482
        line 164: 488
        line 165: 494
        line 169: 503
        line 170: 519
        line 171: 535
        line 172: 551
        line 173: 567
        line 175: 580
        line 178: 583
        line 179: 589
        line 183: 590
        line 185: 596
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           47      72     5  stat   Lext/mods/commons/data/StatSet;
           71      48     6 oldpoints   I
           81      38     7 points   I
           24     123     4   val   Ljava/lang/String;
          190      66     5  stat   Lext/mods/commons/data/StatSet;
          214      42     6 oldpoints   I
          224      32     7 points   I
          167     117     4   val   Ljava/lang/String;
          327      68     5  stat   Lext/mods/commons/data/StatSet;
          304     119     4   val   Ljava/lang/String;
          458     122     4   set   Lext/mods/commons/data/StatSet;
            0     597     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminOlympiadPoints;
            0     597     1 command   Ljava/lang/String;
            0     597     2 player   Lext/mods/gameserver/model/actor/Player;
            7     590     3 targetPlayer   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 23
        frame_type = 254 /* append */
          offset_delta = 59
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String, class ext/mods/commons/data/StatSet ]
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ int, int ]
        frame_type = 248 /* chop */
          offset_delta = 26
        frame_type = 6 /* same */
        frame_type = 250 /* chop */
          offset_delta = 17
        frame_type = 2 /* same */
        frame_type = 253 /* append */
          offset_delta = 51
          locals = [ class java/lang/String, class ext/mods/commons/data/StatSet ]
        frame_type = 253 /* append */
          offset_delta = 29
          locals = [ int, int ]
        frame_type = 248 /* chop */
          offset_delta = 26
        frame_type = 6 /* same */
        frame_type = 250 /* chop */
          offset_delta = 17
        frame_type = 2 /* same */
        frame_type = 253 /* append */
          offset_delta = 51
          locals = [ class java/lang/String, class ext/mods/commons/data/StatSet ]
        frame_type = 25 /* same */
        frame_type = 250 /* chop */
          offset_delta = 32
        frame_type = 6 /* same */
        frame_type = 250 /* chop */
          offset_delta = 17
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 76
          locals = [ class ext/mods/commons/data/StatSet ]
        frame_type = 250 /* chop */
          offset_delta = 76
        frame_type = 2 /* same */
        frame_type = 6 /* same */
        frame_type = 5 /* same */

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #130                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 190: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminOlympiadPoints;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_4
         1: anewarray     #16                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #13                 // String admin_addolypoints
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #87                 // String admin_removeolypoints
        13: aastore
        14: dup
        15: iconst_2
        16: ldc           #93                 // String admin_setolypoints
        18: aastore
        19: dup
        20: iconst_3
        21: ldc           #101                // String admin_getolypoints
        23: aastore
        24: putstatic     #130                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        27: return
      LineNumberTable:
        line 28: 0
}
SourceFile: "AdminOlympiadPoints.java"
BootstrapMethods:
  0: #173 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #161 Player \u0001 now has \u0001 Olympiad points.
  1: #173 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #163 >=========>>\u0001<<=========
  2: #173 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #165    Match(s):  \u0001
  3: #173 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #167    Win(s):    \u0001
  4: #173 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #169    Defeat(s): \u0001
  5: #173 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #171    Point(s):  \u0001
InnerClasses:
  public static final #184= #180 of #182; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
