// Bytecode for: ext.mods.gameserver.handler.BypassHandler
// File: ext\mods\gameserver\handler\BypassHandler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/BypassHandler.class
  Last modified 9 de jul de 2026; size 2204 bytes
  MD5 checksum 069831aeead3a0842c1be2db892f7799
  Compiled from "BypassHandler.java"
public class ext.mods.gameserver.handler.BypassHandler extends ext.mods.gameserver.handler.AbstractHandler<java.lang.Integer, ext.mods.gameserver.handler.IBypassHandler>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/handler/BypassHandler
  super_class: #6                         // ext/mods/gameserver/handler/AbstractHandler
  interfaces: 0, fields: 0, methods: 6, attributes: 4
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/handler/IBypassHandler
   #2 = Utf8               ext/mods/gameserver/handler/IBypassHandler
   #3 = String             #4             // bypasshandlers
   #4 = Utf8               bypasshandlers
   #5 = Methodref          #6.#7          // ext/mods/gameserver/handler/AbstractHandler."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
   #6 = Class              #8             // ext/mods/gameserver/handler/AbstractHandler
   #7 = NameAndType        #9:#10         // "<init>":(Ljava/lang/Class;Ljava/lang/String;)V
   #8 = Utf8               ext/mods/gameserver/handler/AbstractHandler
   #9 = Utf8               <init>
  #10 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)V
  #11 = InterfaceMethodref #1.#12         // ext/mods/gameserver/handler/IBypassHandler.getBypassList:()[Ljava/lang/String;
  #12 = NameAndType        #13:#14        // getBypassList:()[Ljava/lang/String;
  #13 = Utf8               getBypassList
  #14 = Utf8               ()[Ljava/lang/String;
  #15 = Fieldref           #16.#17        // ext/mods/gameserver/handler/BypassHandler._entries:Ljava/util/Map;
  #16 = Class              #18            // ext/mods/gameserver/handler/BypassHandler
  #17 = NameAndType        #19:#20        // _entries:Ljava/util/Map;
  #18 = Utf8               ext/mods/gameserver/handler/BypassHandler
  #19 = Utf8               _entries
  #20 = Utf8               Ljava/util/Map;
  #21 = Methodref          #22.#23        // java/lang/String.hashCode:()I
  #22 = Class              #24            // java/lang/String
  #23 = NameAndType        #25:#26        // hashCode:()I
  #24 = Utf8               java/lang/String
  #25 = Utf8               hashCode
  #26 = Utf8               ()I
  #27 = Methodref          #28.#29        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #28 = Class              #30            // java/lang/Integer
  #29 = NameAndType        #31:#32        // valueOf:(I)Ljava/lang/Integer;
  #30 = Utf8               java/lang/Integer
  #31 = Utf8               valueOf
  #32 = Utf8               (I)Ljava/lang/Integer;
  #33 = InterfaceMethodref #34.#35        // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #34 = Class              #36            // java/util/Map
  #35 = NameAndType        #37:#38        // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #36 = Utf8               java/util/Map
  #37 = Utf8               put
  #38 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #39 = String             #40            //
  #40 = Utf8
  #41 = Methodref          #22.#42        // java/lang/String.indexOf:(Ljava/lang/String;)I
  #42 = NameAndType        #43:#44        // indexOf:(Ljava/lang/String;)I
  #43 = Utf8               indexOf
  #44 = Utf8               (Ljava/lang/String;)I
  #45 = Methodref          #22.#46        // java/lang/String.substring:(II)Ljava/lang/String;
  #46 = NameAndType        #47:#48        // substring:(II)Ljava/lang/String;
  #47 = Utf8               substring
  #48 = Utf8               (II)Ljava/lang/String;
  #49 = Methodref          #6.#50         // ext/mods/gameserver/handler/AbstractHandler.getHandler:(Ljava/lang/Object;)Ljava/lang/Object;
  #50 = NameAndType        #51:#52        // getHandler:(Ljava/lang/Object;)Ljava/lang/Object;
  #51 = Utf8               getHandler
  #52 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #53 = Fieldref           #54.#55        // ext/mods/gameserver/handler/BypassHandler$Singleton.INSTANCE:Lext/mods/gameserver/handler/BypassHandler;
  #54 = Class              #56            // ext/mods/gameserver/handler/BypassHandler$Singleton
  #55 = NameAndType        #57:#58        // INSTANCE:Lext/mods/gameserver/handler/BypassHandler;
  #56 = Utf8               ext/mods/gameserver/handler/BypassHandler$Singleton
  #57 = Utf8               INSTANCE
  #58 = Utf8               Lext/mods/gameserver/handler/BypassHandler;
  #59 = Methodref          #16.#60        // ext/mods/gameserver/handler/BypassHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IBypassHandler;
  #60 = NameAndType        #51:#61        // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IBypassHandler;
  #61 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/IBypassHandler;
  #62 = Methodref          #16.#63        // ext/mods/gameserver/handler/BypassHandler.registerHandler:(Lext/mods/gameserver/handler/IBypassHandler;)V
  #63 = NameAndType        #64:#65        // registerHandler:(Lext/mods/gameserver/handler/IBypassHandler;)V
  #64 = Utf8               registerHandler
  #65 = Utf8               (Lext/mods/gameserver/handler/IBypassHandler;)V
  #66 = Utf8               ()V
  #67 = Utf8               Code
  #68 = Utf8               LineNumberTable
  #69 = Utf8               LocalVariableTable
  #70 = Utf8               this
  #71 = Utf8               id
  #72 = Utf8               Ljava/lang/String;
  #73 = Utf8               handler
  #74 = Utf8               Lext/mods/gameserver/handler/IBypassHandler;
  #75 = Utf8               StackMapTable
  #76 = Class              #77            // "[Ljava/lang/String;"
  #77 = Utf8               [Ljava/lang/String;
  #78 = Utf8               bypassCommand
  #79 = Utf8               key
  #80 = Utf8               Ljava/lang/Object;
  #81 = Utf8               index
  #82 = Utf8               I
  #83 = Utf8               command
  #84 = Utf8               getInstance
  #85 = Utf8               ()Lext/mods/gameserver/handler/BypassHandler;
  #86 = Utf8               MethodParameters
  #87 = Utf8               (Ljava/lang/Object;)V
  #88 = Utf8               Signature
  #89 = Utf8               Lext/mods/gameserver/handler/AbstractHandler<Ljava/lang/Integer;Lext/mods/gameserver/handler/IBypassHandler;>;
  #90 = Utf8               SourceFile
  #91 = Utf8               BypassHandler.java
  #92 = Utf8               NestMembers
  #93 = Utf8               InnerClasses
  #94 = Utf8               Singleton
{
  protected ext.mods.gameserver.handler.BypassHandler();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: ldc           #1                  // class ext/mods/gameserver/handler/IBypassHandler
         3: ldc           #3                  // String bypasshandlers
         5: invokespecial #5                  // Method ext/mods/gameserver/handler/AbstractHandler."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 24: 0
        line 25: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/handler/BypassHandler;

  public void registerHandler(ext.mods.gameserver.handler.IBypassHandler);
    descriptor: (Lext/mods/gameserver/handler/IBypassHandler;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: aload_1
         1: invokeinterface #11,  1           // InterfaceMethod ext/mods/gameserver/handler/IBypassHandler.getBypassList:()[Ljava/lang/String;
         6: astore_2
         7: aload_2
         8: arraylength
         9: istore_3
        10: iconst_0
        11: istore        4
        13: iload         4
        15: iload_3
        16: if_icmpge     50
        19: aload_2
        20: iload         4
        22: aaload
        23: astore        5
        25: aload_0
        26: getfield      #15                 // Field _entries:Ljava/util/Map;
        29: aload         5
        31: invokevirtual #21                 // Method java/lang/String.hashCode:()I
        34: invokestatic  #27                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        37: aload_1
        38: invokeinterface #33,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        43: pop
        44: iinc          4, 1
        47: goto          13
        50: return
      LineNumberTable:
        line 30: 0
        line 31: 25
        line 30: 44
        line 32: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           25      19     5    id   Ljava/lang/String;
            0      51     0  this   Lext/mods/gameserver/handler/BypassHandler;
            0      51     1 handler   Lext/mods/gameserver/handler/IBypassHandler;
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 13
          locals = [ class "[Ljava/lang/String;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 36

  public ext.mods.gameserver.handler.IBypassHandler getHandler(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Lext/mods/gameserver/handler/IBypassHandler;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=2
         0: aload_1
         1: instanceof    #22                 // class java/lang/String
         4: ifeq          15
         7: aload_1
         8: checkcast     #22                 // class java/lang/String
        11: astore_2
        12: goto          17
        15: aconst_null
        16: areturn
        17: aload_2
        18: ldc           #39                 // String
        20: invokevirtual #41                 // Method java/lang/String.indexOf:(Ljava/lang/String;)I
        23: istore_3
        24: iload_3
        25: iconst_m1
        26: if_icmpne     33
        29: aload_2
        30: goto          39
        33: aload_2
        34: iconst_0
        35: iload_3
        36: invokevirtual #45                 // Method java/lang/String.substring:(II)Ljava/lang/String;
        39: astore        4
        41: aload_0
        42: aload         4
        44: invokevirtual #21                 // Method java/lang/String.hashCode:()I
        47: invokestatic  #27                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        50: invokespecial #49                 // Method ext/mods/gameserver/handler/AbstractHandler.getHandler:(Ljava/lang/Object;)Ljava/lang/Object;
        53: checkcast     #1                  // class ext/mods/gameserver/handler/IBypassHandler
        56: areturn
      LineNumberTable:
        line 37: 0
        line 38: 15
        line 40: 17
        line 41: 24
        line 43: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12       3     2 bypassCommand   Ljava/lang/String;
            0      57     0  this   Lext/mods/gameserver/handler/BypassHandler;
            0      57     1   key   Ljava/lang/Object;
           17      40     2 bypassCommand   Ljava/lang/String;
           24      33     3 index   I
           41      16     4 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ int ]
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]

  public static ext.mods.gameserver.handler.BypassHandler getInstance();
    descriptor: ()Lext/mods/gameserver/handler/BypassHandler;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #53                 // Field ext/mods/gameserver/handler/BypassHandler$Singleton.INSTANCE:Lext/mods/gameserver/handler/BypassHandler;
         3: areturn
      LineNumberTable:
        line 48: 0

  public java.lang.Object getHandler(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #59                 // Method getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IBypassHandler;
         5: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/handler/BypassHandler;
    MethodParameters:
      Name                           Flags
      <no name>                      synthetic

  public void registerHandler(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: checkcast     #1                  // class ext/mods/gameserver/handler/IBypassHandler
         5: invokevirtual #62                 // Method registerHandler:(Lext/mods/gameserver/handler/IBypassHandler;)V
         8: return
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/handler/BypassHandler;
    MethodParameters:
      Name                           Flags
      <no name>                      synthetic
}
Signature: #89                          // Lext/mods/gameserver/handler/AbstractHandler<Ljava/lang/Integer;Lext/mods/gameserver/handler/IBypassHandler;>;
SourceFile: "BypassHandler.java"
NestMembers:
  ext/mods/gameserver/handler/BypassHandler$Singleton
