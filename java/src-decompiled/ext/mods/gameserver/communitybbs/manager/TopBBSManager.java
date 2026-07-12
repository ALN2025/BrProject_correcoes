// Bytecode for: ext.mods.gameserver.communitybbs.manager.TopBBSManager
// File: ext\mods\gameserver\communitybbs\manager\TopBBSManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/manager/TopBBSManager.class
  Last modified 9 de jul de 2026; size 1485 bytes
  MD5 checksum 1446ac1de87e81b1fd00bf08c164efef
  Compiled from "TopBBSManager.java"
public class ext.mods.gameserver.communitybbs.manager.TopBBSManager extends ext.mods.gameserver.communitybbs.manager.BaseBBSManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #18                         // ext/mods/gameserver/communitybbs/manager/TopBBSManager
  super_class: #2                         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  interfaces: 0, fields: 0, methods: 4, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = String             #8             // _bbshome
   #8 = Utf8               _bbshome
   #9 = Methodref          #10.#11        // java/lang/String.equals:(Ljava/lang/Object;)Z
  #10 = Class              #12            // java/lang/String
  #11 = NameAndType        #13:#14        // equals:(Ljava/lang/Object;)Z
  #12 = Utf8               java/lang/String
  #13 = Utf8               equals
  #14 = Utf8               (Ljava/lang/Object;)Z
  #15 = String             #16            // index.htm
  #16 = Utf8               index.htm
  #17 = Methodref          #18.#19        // ext/mods/gameserver/communitybbs/manager/TopBBSManager.loadStaticHtm:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #18 = Class              #20            // ext/mods/gameserver/communitybbs/manager/TopBBSManager
  #19 = NameAndType        #21:#22        // loadStaticHtm:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #20 = Utf8               ext/mods/gameserver/communitybbs/manager/TopBBSManager
  #21 = Utf8               loadStaticHtm
  #22 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #23 = String             #24            // _bbshome;
  #24 = Utf8               _bbshome;
  #25 = Methodref          #10.#26        // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #26 = NameAndType        #27:#28        // startsWith:(Ljava/lang/String;)Z
  #27 = Utf8               startsWith
  #28 = Utf8               (Ljava/lang/String;)Z
  #29 = Class              #30            // java/util/StringTokenizer
  #30 = Utf8               java/util/StringTokenizer
  #31 = String             #32            // ;
  #32 = Utf8               ;
  #33 = Methodref          #29.#34        // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
  #34 = NameAndType        #5:#35         // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
  #35 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #36 = Methodref          #29.#37        // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
  #37 = NameAndType        #38:#39        // nextToken:()Ljava/lang/String;
  #38 = Utf8               nextToken
  #39 = Utf8               ()Ljava/lang/String;
  #40 = Methodref          #2.#41         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #41 = NameAndType        #42:#22        // parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #42 = Utf8               parseCmd
  #43 = String             #44            // top/
  #44 = Utf8               top/
  #45 = Fieldref           #46.#47        // ext/mods/gameserver/communitybbs/manager/TopBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/manager/TopBBSManager;
  #46 = Class              #48            // ext/mods/gameserver/communitybbs/manager/TopBBSManager$SingletonHolder
  #47 = NameAndType        #49:#50        // INSTANCE:Lext/mods/gameserver/communitybbs/manager/TopBBSManager;
  #48 = Utf8               ext/mods/gameserver/communitybbs/manager/TopBBSManager$SingletonHolder
  #49 = Utf8               INSTANCE
  #50 = Utf8               Lext/mods/gameserver/communitybbs/manager/TopBBSManager;
  #51 = Utf8               Code
  #52 = Utf8               LineNumberTable
  #53 = Utf8               LocalVariableTable
  #54 = Utf8               this
  #55 = Utf8               st
  #56 = Utf8               Ljava/util/StringTokenizer;
  #57 = Utf8               command
  #58 = Utf8               Ljava/lang/String;
  #59 = Utf8               player
  #60 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #61 = Utf8               StackMapTable
  #62 = Utf8               getFolder
  #63 = Utf8               getInstance
  #64 = Utf8               ()Lext/mods/gameserver/communitybbs/manager/TopBBSManager;
  #65 = Utf8               SourceFile
  #66 = Utf8               TopBBSManager.java
  #67 = Utf8               NestMembers
  #68 = Utf8               InnerClasses
  #69 = Utf8               SingletonHolder
{
  protected ext.mods.gameserver.communitybbs.manager.TopBBSManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
        line 28: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/manager/TopBBSManager;

  public void parseCmd(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_1
         1: ldc           #7                  // String _bbshome
         3: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          19
         9: aload_0
        10: ldc           #15                 // String index.htm
        12: aload_2
        13: invokevirtual #17                 // Method loadStaticHtm:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        16: goto          62
        19: aload_1
        20: ldc           #23                 // String _bbshome;
        22: invokevirtual #25                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        25: ifeq          56
        28: new           #29                 // class java/util/StringTokenizer
        31: dup
        32: aload_1
        33: ldc           #31                 // String ;
        35: invokespecial #33                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        38: astore_3
        39: aload_3
        40: invokevirtual #36                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        43: pop
        44: aload_0
        45: aload_3
        46: invokevirtual #36                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        49: aload_2
        50: invokevirtual #17                 // Method loadStaticHtm:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        53: goto          62
        56: aload_0
        57: aload_1
        58: aload_2
        59: invokespecial #40                 // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        62: return
      LineNumberTable:
        line 33: 0
        line 35: 9
        line 37: 19
        line 39: 28
        line 40: 39
        line 42: 44
        line 43: 53
        line 45: 56
        line 46: 62
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39      14     3    st   Ljava/util/StringTokenizer;
            0      63     0  this   Lext/mods/gameserver/communitybbs/manager/TopBBSManager;
            0      63     1 command   Ljava/lang/String;
            0      63     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 19 /* same */
        frame_type = 36 /* same */
        frame_type = 5 /* same */

  protected java.lang.String getFolder();
    descriptor: ()Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: ldc           #43                 // String top/
         2: areturn
      LineNumberTable:
        line 51: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/communitybbs/manager/TopBBSManager;

  public static ext.mods.gameserver.communitybbs.manager.TopBBSManager getInstance();
    descriptor: ()Lext/mods/gameserver/communitybbs/manager/TopBBSManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #45                 // Field ext/mods/gameserver/communitybbs/manager/TopBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/manager/TopBBSManager;
         3: areturn
      LineNumberTable:
        line 56: 0
}
SourceFile: "TopBBSManager.java"
NestMembers:
  ext/mods/gameserver/communitybbs/manager/TopBBSManager$SingletonHolder
