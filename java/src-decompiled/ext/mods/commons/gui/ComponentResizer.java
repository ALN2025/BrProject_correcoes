// Bytecode for: ext.mods.commons.gui.ComponentResizer
// File: ext\mods\commons\gui\ComponentResizer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/ComponentResizer.class
  Last modified 9 de jul de 2026; size 4227 bytes
  MD5 checksum ac5d88d8ecfe0942680c1e47407b0ea6
  Compiled from "ComponentResizer.java"
public class ext.mods.commons.gui.ComponentResizer extends java.awt.event.MouseAdapter
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/ComponentResizer
  super_class: #2                         // java/awt/event/MouseAdapter
  interfaces: 0, fields: 6, methods: 9, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/awt/event/MouseAdapter."<init>":()V
    #2 = Class              #4            // java/awt/event/MouseAdapter
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/awt/event/MouseAdapter
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/commons/gui/ComponentResizer.dragInsets:I
    #8 = Class              #10           // ext/mods/commons/gui/ComponentResizer
    #9 = NameAndType        #11:#12       // dragInsets:I
   #10 = Utf8               ext/mods/commons/gui/ComponentResizer
   #11 = Utf8               dragInsets
   #12 = Utf8               I
   #13 = Class              #14           // java/awt/Cursor
   #14 = Utf8               java/awt/Cursor
   #15 = Fieldref           #8.#16        // ext/mods/commons/gui/ComponentResizer.pressedCursorType:I
   #16 = NameAndType        #17:#12       // pressedCursorType:I
   #17 = Utf8               pressedCursorType
   #18 = Fieldref           #8.#19        // ext/mods/commons/gui/ComponentResizer.window:Ljava/awt/Window;
   #19 = NameAndType        #20:#21       // window:Ljava/awt/Window;
   #20 = Utf8               window
   #21 = Utf8               Ljava/awt/Window;
   #22 = Methodref          #23.#24       // java/awt/Window.addMouseListener:(Ljava/awt/event/MouseListener;)V
   #23 = Class              #25           // java/awt/Window
   #24 = NameAndType        #26:#27       // addMouseListener:(Ljava/awt/event/MouseListener;)V
   #25 = Utf8               java/awt/Window
   #26 = Utf8               addMouseListener
   #27 = Utf8               (Ljava/awt/event/MouseListener;)V
   #28 = Methodref          #23.#29       // java/awt/Window.addMouseMotionListener:(Ljava/awt/event/MouseMotionListener;)V
   #29 = NameAndType        #30:#31       // addMouseMotionListener:(Ljava/awt/event/MouseMotionListener;)V
   #30 = Utf8               addMouseMotionListener
   #31 = Utf8               (Ljava/awt/event/MouseMotionListener;)V
   #32 = Methodref          #33.#24       // java/awt/Component.addMouseListener:(Ljava/awt/event/MouseListener;)V
   #33 = Class              #34           // java/awt/Component
   #34 = Utf8               java/awt/Component
   #35 = Methodref          #33.#29       // java/awt/Component.addMouseMotionListener:(Ljava/awt/event/MouseMotionListener;)V
   #36 = Methodref          #37.#38       // java/awt/event/MouseEvent.getComponent:()Ljava/awt/Component;
   #37 = Class              #39           // java/awt/event/MouseEvent
   #38 = NameAndType        #40:#41       // getComponent:()Ljava/awt/Component;
   #39 = Utf8               java/awt/event/MouseEvent
   #40 = Utf8               getComponent
   #41 = Utf8               ()Ljava/awt/Component;
   #42 = Methodref          #37.#43       // java/awt/event/MouseEvent.getPoint:()Ljava/awt/Point;
   #43 = NameAndType        #44:#45       // getPoint:()Ljava/awt/Point;
   #44 = Utf8               getPoint
   #45 = Utf8               ()Ljava/awt/Point;
   #46 = Methodref          #47.#48       // javax/swing/SwingUtilities.convertPoint:(Ljava/awt/Component;Ljava/awt/Point;Ljava/awt/Component;)Ljava/awt/Point;
   #47 = Class              #49           // javax/swing/SwingUtilities
   #48 = NameAndType        #50:#51       // convertPoint:(Ljava/awt/Component;Ljava/awt/Point;Ljava/awt/Component;)Ljava/awt/Point;
   #49 = Utf8               javax/swing/SwingUtilities
   #50 = Utf8               convertPoint
   #51 = Utf8               (Ljava/awt/Component;Ljava/awt/Point;Ljava/awt/Component;)Ljava/awt/Point;
   #52 = Methodref          #8.#53        // ext/mods/commons/gui/ComponentResizer.getCursorType:(Ljava/awt/Point;)I
   #53 = NameAndType        #54:#55       // getCursorType:(Ljava/awt/Point;)I
   #54 = Utf8               getCursorType
   #55 = Utf8               (Ljava/awt/Point;)I
   #56 = Methodref          #13.#57       // java/awt/Cursor.getPredefinedCursor:(I)Ljava/awt/Cursor;
   #57 = NameAndType        #58:#59       // getPredefinedCursor:(I)Ljava/awt/Cursor;
   #58 = Utf8               getPredefinedCursor
   #59 = Utf8               (I)Ljava/awt/Cursor;
   #60 = Methodref          #23.#61       // java/awt/Window.setCursor:(Ljava/awt/Cursor;)V
   #61 = NameAndType        #62:#63       // setCursor:(Ljava/awt/Cursor;)V
   #62 = Utf8               setCursor
   #63 = Utf8               (Ljava/awt/Cursor;)V
   #64 = Methodref          #33.#61       // java/awt/Component.setCursor:(Ljava/awt/Cursor;)V
   #65 = Methodref          #23.#66       // java/awt/Window.getCursor:()Ljava/awt/Cursor;
   #66 = NameAndType        #67:#68       // getCursor:()Ljava/awt/Cursor;
   #67 = Utf8               getCursor
   #68 = Utf8               ()Ljava/awt/Cursor;
   #69 = Methodref          #13.#70       // java/awt/Cursor.getType:()I
   #70 = NameAndType        #71:#72       // getType:()I
   #71 = Utf8               getType
   #72 = Utf8               ()I
   #73 = Methodref          #13.#74       // java/awt/Cursor.getDefaultCursor:()Ljava/awt/Cursor;
   #74 = NameAndType        #75:#68       // getDefaultCursor:()Ljava/awt/Cursor;
   #75 = Utf8               getDefaultCursor
   #76 = Methodref          #23.#77       // java/awt/Window.getBounds:()Ljava/awt/Rectangle;
   #77 = NameAndType        #78:#79       // getBounds:()Ljava/awt/Rectangle;
   #78 = Utf8               getBounds
   #79 = Utf8               ()Ljava/awt/Rectangle;
   #80 = Fieldref           #8.#81        // ext/mods/commons/gui/ComponentResizer.startBounds:Ljava/awt/Rectangle;
   #81 = NameAndType        #82:#83       // startBounds:Ljava/awt/Rectangle;
   #82 = Utf8               startBounds
   #83 = Utf8               Ljava/awt/Rectangle;
   #84 = Methodref          #37.#85       // java/awt/event/MouseEvent.getLocationOnScreen:()Ljava/awt/Point;
   #85 = NameAndType        #86:#45       // getLocationOnScreen:()Ljava/awt/Point;
   #86 = Utf8               getLocationOnScreen
   #87 = Fieldref           #8.#88        // ext/mods/commons/gui/ComponentResizer.startMousePoint:Ljava/awt/Point;
   #88 = NameAndType        #89:#90       // startMousePoint:Ljava/awt/Point;
   #89 = Utf8               startMousePoint
   #90 = Utf8               Ljava/awt/Point;
   #91 = Fieldref           #92.#93       // java/awt/Point.x:I
   #92 = Class              #94           // java/awt/Point
   #93 = NameAndType        #95:#12       // x:I
   #94 = Utf8               java/awt/Point
   #95 = Utf8               x
   #96 = Fieldref           #92.#97       // java/awt/Point.y:I
   #97 = NameAndType        #98:#12       // y:I
   #98 = Utf8               y
   #99 = Class              #100          // java/awt/Rectangle
  #100 = Utf8               java/awt/Rectangle
  #101 = Methodref          #99.#102      // java/awt/Rectangle."<init>":(Ljava/awt/Rectangle;)V
  #102 = NameAndType        #5:#103       // "<init>":(Ljava/awt/Rectangle;)V
  #103 = Utf8               (Ljava/awt/Rectangle;)V
  #104 = Fieldref           #8.#105       // ext/mods/commons/gui/ComponentResizer.MIN_SIZE:Ljava/awt/Dimension;
  #105 = NameAndType        #106:#107     // MIN_SIZE:Ljava/awt/Dimension;
  #106 = Utf8               MIN_SIZE
  #107 = Utf8               Ljava/awt/Dimension;
  #108 = Fieldref           #109.#110     // java/awt/Dimension.width:I
  #109 = Class              #111          // java/awt/Dimension
  #110 = NameAndType        #112:#12      // width:I
  #111 = Utf8               java/awt/Dimension
  #112 = Utf8               width
  #113 = Fieldref           #99.#110      // java/awt/Rectangle.width:I
  #114 = Methodref          #115.#116     // java/lang/Math.max:(II)I
  #115 = Class              #117          // java/lang/Math
  #116 = NameAndType        #118:#119     // max:(II)I
  #117 = Utf8               java/lang/Math
  #118 = Utf8               max
  #119 = Utf8               (II)I
  #120 = Fieldref           #99.#93       // java/awt/Rectangle.x:I
  #121 = Fieldref           #109.#122     // java/awt/Dimension.height:I
  #122 = NameAndType        #123:#12      // height:I
  #123 = Utf8               height
  #124 = Fieldref           #99.#122      // java/awt/Rectangle.height:I
  #125 = Fieldref           #99.#97       // java/awt/Rectangle.y:I
  #126 = Methodref          #23.#127      // java/awt/Window.setBounds:(Ljava/awt/Rectangle;)V
  #127 = NameAndType        #128:#103     // setBounds:(Ljava/awt/Rectangle;)V
  #128 = Utf8               setBounds
  #129 = Methodref          #23.#130      // java/awt/Window.revalidate:()V
  #130 = NameAndType        #131:#6       // revalidate:()V
  #131 = Utf8               revalidate
  #132 = Methodref          #23.#133      // java/awt/Window.repaint:()V
  #133 = NameAndType        #134:#6       // repaint:()V
  #134 = Utf8               repaint
  #135 = Methodref          #23.#136      // java/awt/Window.getWidth:()I
  #136 = NameAndType        #137:#72      // getWidth:()I
  #137 = Utf8               getWidth
  #138 = Methodref          #23.#139      // java/awt/Window.getHeight:()I
  #139 = NameAndType        #140:#72      // getHeight:()I
  #140 = Utf8               getHeight
  #141 = Methodref          #109.#142     // java/awt/Dimension."<init>":(II)V
  #142 = NameAndType        #5:#143       // "<init>":(II)V
  #143 = Utf8               (II)V
  #144 = Utf8               ConstantValue
  #145 = Integer            8
  #146 = Utf8               (Ljava/awt/Window;)V
  #147 = Utf8               Code
  #148 = Utf8               LineNumberTable
  #149 = Utf8               LocalVariableTable
  #150 = Utf8               this
  #151 = Utf8               Lext/mods/commons/gui/ComponentResizer;
  #152 = Utf8               registerComponent
  #153 = Utf8               ([Ljava/awt/Component;)V
  #154 = Utf8               c
  #155 = Utf8               Ljava/awt/Component;
  #156 = Utf8               components
  #157 = Utf8               [Ljava/awt/Component;
  #158 = Utf8               StackMapTable
  #159 = Class              #157          // "[Ljava/awt/Component;"
  #160 = Utf8               mouseMoved
  #161 = Utf8               (Ljava/awt/event/MouseEvent;)V
  #162 = Utf8               e
  #163 = Utf8               Ljava/awt/event/MouseEvent;
  #164 = Utf8               source
  #165 = Utf8               p
  #166 = Utf8               cursorType
  #167 = Utf8               mousePressed
  #168 = Utf8               mouseReleased
  #169 = Utf8               mouseDragged
  #170 = Utf8               newWidth
  #171 = Utf8               newHeight
  #172 = Utf8               currMousePoint
  #173 = Utf8               deltaX
  #174 = Utf8               deltaY
  #175 = Utf8               newBounds
  #176 = Utf8               mouseExited
  #177 = Utf8               w
  #178 = Utf8               h
  #179 = Utf8               isRight
  #180 = Utf8               Z
  #181 = Utf8               isLeft
  #182 = Utf8               isBottom
  #183 = Utf8               isTop
  #184 = Utf8               <clinit>
  #185 = Utf8               SourceFile
  #186 = Utf8               ComponentResizer.java
{
  public ext.mods.commons.gui.ComponentResizer(java.awt.Window);
    descriptor: (Ljava/awt/Window;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/awt/event/MouseAdapter."<init>":()V
         4: aload_0
         5: bipush        8
         7: putfield      #7                  // Field dragInsets:I
        10: aload_0
        11: iconst_0
        12: putfield      #15                 // Field pressedCursorType:I
        15: aload_0
        16: aload_1
        17: putfield      #18                 // Field window:Ljava/awt/Window;
        20: aload_1
        21: aload_0
        22: invokevirtual #22                 // Method java/awt/Window.addMouseListener:(Ljava/awt/event/MouseListener;)V
        25: aload_1
        26: aload_0
        27: invokevirtual #28                 // Method java/awt/Window.addMouseMotionListener:(Ljava/awt/event/MouseMotionListener;)V
        30: return
      LineNumberTable:
        line 39: 0
        line 33: 4
        line 35: 10
        line 40: 15
        line 41: 20
        line 42: 25
        line 43: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/commons/gui/ComponentResizer;
            0      31     1 window   Ljava/awt/Window;

  public void registerComponent(java.awt.Component...);
    descriptor: ([Ljava/awt/Component;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=2, locals=6, args_size=2
         0: aload_1
         1: astore_2
         2: aload_2
         3: arraylength
         4: istore_3
         5: iconst_0
         6: istore        4
         8: iload         4
        10: iload_3
        11: if_icmpge     38
        14: aload_2
        15: iload         4
        17: aaload
        18: astore        5
        20: aload         5
        22: aload_0
        23: invokevirtual #32                 // Method java/awt/Component.addMouseListener:(Ljava/awt/event/MouseListener;)V
        26: aload         5
        28: aload_0
        29: invokevirtual #35                 // Method java/awt/Component.addMouseMotionListener:(Ljava/awt/event/MouseMotionListener;)V
        32: iinc          4, 1
        35: goto          8
        38: return
      LineNumberTable:
        line 46: 0
        line 47: 20
        line 48: 26
        line 46: 32
        line 50: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20      12     5     c   Ljava/awt/Component;
            0      39     0  this   Lext/mods/commons/gui/ComponentResizer;
            0      39     1 components   [Ljava/awt/Component;
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 8
          locals = [ class "[Ljava/awt/Component;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 29

  public void mouseMoved(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=2
         0: aload_1
         1: invokevirtual #36                 // Method java/awt/event/MouseEvent.getComponent:()Ljava/awt/Component;
         4: astore_2
         5: aload_2
         6: aload_1
         7: invokevirtual #42                 // Method java/awt/event/MouseEvent.getPoint:()Ljava/awt/Point;
        10: aload_0
        11: getfield      #18                 // Field window:Ljava/awt/Window;
        14: invokestatic  #46                 // Method javax/swing/SwingUtilities.convertPoint:(Ljava/awt/Component;Ljava/awt/Point;Ljava/awt/Component;)Ljava/awt/Point;
        17: astore_3
        18: aload_0
        19: aload_3
        20: invokevirtual #52                 // Method getCursorType:(Ljava/awt/Point;)I
        23: istore        4
        25: iload         4
        27: ifeq          62
        30: aload_0
        31: getfield      #18                 // Field window:Ljava/awt/Window;
        34: iload         4
        36: invokestatic  #56                 // Method java/awt/Cursor.getPredefinedCursor:(I)Ljava/awt/Cursor;
        39: invokevirtual #60                 // Method java/awt/Window.setCursor:(Ljava/awt/Cursor;)V
        42: aload_2
        43: aload_0
        44: getfield      #18                 // Field window:Ljava/awt/Window;
        47: if_acmpeq     98
        50: aload_2
        51: iload         4
        53: invokestatic  #56                 // Method java/awt/Cursor.getPredefinedCursor:(I)Ljava/awt/Cursor;
        56: invokevirtual #64                 // Method java/awt/Component.setCursor:(Ljava/awt/Cursor;)V
        59: goto          98
        62: aload_0
        63: getfield      #18                 // Field window:Ljava/awt/Window;
        66: invokevirtual #65                 // Method java/awt/Window.getCursor:()Ljava/awt/Cursor;
        69: invokevirtual #69                 // Method java/awt/Cursor.getType:()I
        72: ifeq          85
        75: aload_0
        76: getfield      #18                 // Field window:Ljava/awt/Window;
        79: invokestatic  #73                 // Method java/awt/Cursor.getDefaultCursor:()Ljava/awt/Cursor;
        82: invokevirtual #60                 // Method java/awt/Window.setCursor:(Ljava/awt/Cursor;)V
        85: aload_2
        86: aload_0
        87: getfield      #18                 // Field window:Ljava/awt/Window;
        90: if_acmpeq     98
        93: aload_2
        94: aconst_null
        95: invokevirtual #64                 // Method java/awt/Component.setCursor:(Ljava/awt/Cursor;)V
        98: return
      LineNumberTable:
        line 54: 0
        line 55: 5
        line 56: 18
        line 58: 25
        line 59: 30
        line 60: 42
        line 62: 62
        line 63: 75
        line 65: 85
        line 67: 98
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      99     0  this   Lext/mods/commons/gui/ComponentResizer;
            0      99     1     e   Ljava/awt/event/MouseEvent;
            5      94     2 source   Ljava/awt/Component;
           18      81     3     p   Ljava/awt/Point;
           25      74     4 cursorType   I
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 62
          locals = [ class java/awt/Component, class java/awt/Point, int ]
        frame_type = 22 /* same */
        frame_type = 12 /* same */

  public void mousePressed(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_1
         1: invokevirtual #36                 // Method java/awt/event/MouseEvent.getComponent:()Ljava/awt/Component;
         4: astore_2
         5: aload_2
         6: aload_1
         7: invokevirtual #42                 // Method java/awt/event/MouseEvent.getPoint:()Ljava/awt/Point;
        10: aload_0
        11: getfield      #18                 // Field window:Ljava/awt/Window;
        14: invokestatic  #46                 // Method javax/swing/SwingUtilities.convertPoint:(Ljava/awt/Component;Ljava/awt/Point;Ljava/awt/Component;)Ljava/awt/Point;
        17: astore_3
        18: aload_0
        19: aload_0
        20: aload_3
        21: invokevirtual #52                 // Method getCursorType:(Ljava/awt/Point;)I
        24: putfield      #15                 // Field pressedCursorType:I
        27: aload_0
        28: aload_0
        29: getfield      #18                 // Field window:Ljava/awt/Window;
        32: invokevirtual #76                 // Method java/awt/Window.getBounds:()Ljava/awt/Rectangle;
        35: putfield      #80                 // Field startBounds:Ljava/awt/Rectangle;
        38: aload_0
        39: aload_1
        40: invokevirtual #84                 // Method java/awt/event/MouseEvent.getLocationOnScreen:()Ljava/awt/Point;
        43: putfield      #87                 // Field startMousePoint:Ljava/awt/Point;
        46: return
      LineNumberTable:
        line 71: 0
        line 72: 5
        line 74: 18
        line 75: 27
        line 76: 38
        line 77: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/commons/gui/ComponentResizer;
            0      47     1     e   Ljava/awt/event/MouseEvent;
            5      42     2 source   Ljava/awt/Component;
           18      29     3     p   Ljava/awt/Point;

  public void mouseReleased(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iconst_0
         2: putfield      #15                 // Field pressedCursorType:I
         5: aload_0
         6: aconst_null
         7: putfield      #80                 // Field startBounds:Ljava/awt/Rectangle;
        10: aload_0
        11: aconst_null
        12: putfield      #87                 // Field startMousePoint:Ljava/awt/Point;
        15: aload_0
        16: getfield      #18                 // Field window:Ljava/awt/Window;
        19: invokestatic  #73                 // Method java/awt/Cursor.getDefaultCursor:()Ljava/awt/Cursor;
        22: invokevirtual #60                 // Method java/awt/Window.setCursor:(Ljava/awt/Cursor;)V
        25: return
      LineNumberTable:
        line 81: 0
        line 82: 5
        line 83: 10
        line 84: 15
        line 85: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/commons/gui/ComponentResizer;
            0      26     1     e   Ljava/awt/event/MouseEvent;

  public void mouseDragged(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=2
         0: aload_0
         1: getfield      #15                 // Field pressedCursorType:I
         4: ifeq          14
         7: aload_0
         8: getfield      #80                 // Field startBounds:Ljava/awt/Rectangle;
        11: ifnonnull     15
        14: return
        15: aload_1
        16: invokevirtual #84                 // Method java/awt/event/MouseEvent.getLocationOnScreen:()Ljava/awt/Point;
        19: astore_2
        20: aload_2
        21: getfield      #91                 // Field java/awt/Point.x:I
        24: aload_0
        25: getfield      #87                 // Field startMousePoint:Ljava/awt/Point;
        28: getfield      #91                 // Field java/awt/Point.x:I
        31: isub
        32: istore_3
        33: aload_2
        34: getfield      #96                 // Field java/awt/Point.y:I
        37: aload_0
        38: getfield      #87                 // Field startMousePoint:Ljava/awt/Point;
        41: getfield      #96                 // Field java/awt/Point.y:I
        44: isub
        45: istore        4
        47: new           #99                 // class java/awt/Rectangle
        50: dup
        51: aload_0
        52: getfield      #80                 // Field startBounds:Ljava/awt/Rectangle;
        55: invokespecial #101                // Method java/awt/Rectangle."<init>":(Ljava/awt/Rectangle;)V
        58: astore        5
        60: aload_0
        61: getfield      #15                 // Field pressedCursorType:I
        64: bipush        11
        66: if_icmpeq     86
        69: aload_0
        70: getfield      #15                 // Field pressedCursorType:I
        73: bipush        7
        75: if_icmpeq     86
        78: aload_0
        79: getfield      #15                 // Field pressedCursorType:I
        82: iconst_5
        83: if_icmpne     109
        86: aload         5
        88: getstatic     #104                // Field MIN_SIZE:Ljava/awt/Dimension;
        91: getfield      #108                // Field java/awt/Dimension.width:I
        94: aload_0
        95: getfield      #80                 // Field startBounds:Ljava/awt/Rectangle;
        98: getfield      #113                // Field java/awt/Rectangle.width:I
       101: iload_3
       102: iadd
       103: invokestatic  #114                // Method java/lang/Math.max:(II)I
       106: putfield      #113                // Field java/awt/Rectangle.width:I
       109: aload_0
       110: getfield      #15                 // Field pressedCursorType:I
       113: bipush        10
       115: if_icmpeq     135
       118: aload_0
       119: getfield      #15                 // Field pressedCursorType:I
       122: bipush        6
       124: if_icmpeq     135
       127: aload_0
       128: getfield      #15                 // Field pressedCursorType:I
       131: iconst_4
       132: if_icmpne     228
       135: getstatic     #104                // Field MIN_SIZE:Ljava/awt/Dimension;
       138: getfield      #108                // Field java/awt/Dimension.width:I
       141: aload_0
       142: getfield      #80                 // Field startBounds:Ljava/awt/Rectangle;
       145: getfield      #113                // Field java/awt/Rectangle.width:I
       148: iload_3
       149: isub
       150: invokestatic  #114                // Method java/lang/Math.max:(II)I
       153: istore        6
       155: iload         6
       157: getstatic     #104                // Field MIN_SIZE:Ljava/awt/Dimension;
       160: getfield      #108                // Field java/awt/Dimension.width:I
       163: if_icmpeq     190
       166: aload         5
       168: aload_0
       169: getfield      #80                 // Field startBounds:Ljava/awt/Rectangle;
       172: getfield      #120                // Field java/awt/Rectangle.x:I
       175: iload_3
       176: iadd
       177: putfield      #120                // Field java/awt/Rectangle.x:I
       180: aload         5
       182: iload         6
       184: putfield      #113                // Field java/awt/Rectangle.width:I
       187: goto          228
       190: aload         5
       192: aload_0
       193: getfield      #80                 // Field startBounds:Ljava/awt/Rectangle;
       196: getfield      #120                // Field java/awt/Rectangle.x:I
       199: aload_0
       200: getfield      #80                 // Field startBounds:Ljava/awt/Rectangle;
       203: getfield      #113                // Field java/awt/Rectangle.width:I
       206: getstatic     #104                // Field MIN_SIZE:Ljava/awt/Dimension;
       209: getfield      #108                // Field java/awt/Dimension.width:I
       212: isub
       213: iadd
       214: putfield      #120                // Field java/awt/Rectangle.x:I
       217: aload         5
       219: getstatic     #104                // Field MIN_SIZE:Ljava/awt/Dimension;
       222: getfield      #108                // Field java/awt/Dimension.width:I
       225: putfield      #113                // Field java/awt/Rectangle.width:I
       228: aload_0
       229: getfield      #15                 // Field pressedCursorType:I
       232: bipush        9
       234: if_icmpeq     253
       237: aload_0
       238: getfield      #15                 // Field pressedCursorType:I
       241: iconst_5
       242: if_icmpeq     253
       245: aload_0
       246: getfield      #15                 // Field pressedCursorType:I
       249: iconst_4
       250: if_icmpne     277
       253: aload         5
       255: getstatic     #104                // Field MIN_SIZE:Ljava/awt/Dimension;
       258: getfield      #121                // Field java/awt/Dimension.height:I
       261: aload_0
       262: getfield      #80                 // Field startBounds:Ljava/awt/Rectangle;
       265: getfield      #124                // Field java/awt/Rectangle.height:I
       268: iload         4
       270: iadd
       271: invokestatic  #114                // Method java/lang/Math.max:(II)I
       274: putfield      #124                // Field java/awt/Rectangle.height:I
       277: aload_0
       278: getfield      #15                 // Field pressedCursorType:I
       281: bipush        8
       283: if_icmpeq     304
       286: aload_0
       287: getfield      #15                 // Field pressedCursorType:I
       290: bipush        7
       292: if_icmpeq     304
       295: aload_0
       296: getfield      #15                 // Field pressedCursorType:I
       299: bipush        6
       301: if_icmpne     399
       304: getstatic     #104                // Field MIN_SIZE:Ljava/awt/Dimension;
       307: getfield      #121                // Field java/awt/Dimension.height:I
       310: aload_0
       311: getfield      #80                 // Field startBounds:Ljava/awt/Rectangle;
       314: getfield      #124                // Field java/awt/Rectangle.height:I
       317: iload         4
       319: isub
       320: invokestatic  #114                // Method java/lang/Math.max:(II)I
       323: istore        6
       325: iload         6
       327: getstatic     #104                // Field MIN_SIZE:Ljava/awt/Dimension;
       330: getfield      #121                // Field java/awt/Dimension.height:I
       333: if_icmpeq     361
       336: aload         5
       338: aload_0
       339: getfield      #80                 // Field startBounds:Ljava/awt/Rectangle;
       342: getfield      #125                // Field java/awt/Rectangle.y:I
       345: iload         4
       347: iadd
       348: putfield      #125                // Field java/awt/Rectangle.y:I
       351: aload         5
       353: iload         6
       355: putfield      #124                // Field java/awt/Rectangle.height:I
       358: goto          399
       361: aload         5
       363: aload_0
       364: getfield      #80                 // Field startBounds:Ljava/awt/Rectangle;
       367: getfield      #125                // Field java/awt/Rectangle.y:I
       370: aload_0
       371: getfield      #80                 // Field startBounds:Ljava/awt/Rectangle;
       374: getfield      #124                // Field java/awt/Rectangle.height:I
       377: getstatic     #104                // Field MIN_SIZE:Ljava/awt/Dimension;
       380: getfield      #121                // Field java/awt/Dimension.height:I
       383: isub
       384: iadd
       385: putfield      #125                // Field java/awt/Rectangle.y:I
       388: aload         5
       390: getstatic     #104                // Field MIN_SIZE:Ljava/awt/Dimension;
       393: getfield      #121                // Field java/awt/Dimension.height:I
       396: putfield      #124                // Field java/awt/Rectangle.height:I
       399: aload_0
       400: getfield      #18                 // Field window:Ljava/awt/Window;
       403: aload         5
       405: invokevirtual #126                // Method java/awt/Window.setBounds:(Ljava/awt/Rectangle;)V
       408: aload_0
       409: getfield      #18                 // Field window:Ljava/awt/Window;
       412: invokevirtual #129                // Method java/awt/Window.revalidate:()V
       415: aload_0
       416: getfield      #18                 // Field window:Ljava/awt/Window;
       419: invokevirtual #132                // Method java/awt/Window.repaint:()V
       422: return
      LineNumberTable:
        line 89: 0
        line 91: 15
        line 92: 20
        line 93: 33
        line 95: 47
        line 98: 60
        line 101: 86
        line 104: 109
        line 107: 135
        line 108: 155
        line 109: 166
        line 110: 180
        line 112: 190
        line 113: 217
        line 117: 228
        line 120: 253
        line 123: 277
        line 126: 304
        line 127: 325
        line 128: 336
        line 129: 351
        line 131: 361
        line 132: 388
        line 136: 399
        line 137: 408
        line 138: 415
        line 139: 422
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          155      73     6 newWidth   I
          325      74     6 newHeight   I
            0     423     0  this   Lext/mods/commons/gui/ComponentResizer;
            0     423     1     e   Ljava/awt/event/MouseEvent;
           20     403     2 currMousePoint   Ljava/awt/Point;
           33     390     3 deltaX   I
           47     376     4 deltaY   I
           60     363     5 newBounds   Ljava/awt/Rectangle;
      StackMapTable: number_of_entries = 12
        frame_type = 14 /* same */
        frame_type = 0 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 70
          locals = [ class ext/mods/commons/gui/ComponentResizer, class java/awt/event/MouseEvent, class java/awt/Point, int, int, class java/awt/Rectangle ]
          stack = []
        frame_type = 22 /* same */
        frame_type = 25 /* same */
        frame_type = 252 /* append */
          offset_delta = 54
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 37
        frame_type = 24 /* same */
        frame_type = 23 /* same */
        frame_type = 26 /* same */
        frame_type = 252 /* append */
          offset_delta = 56
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 37

  public void mouseExited(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #15                 // Field pressedCursorType:I
         4: ifne          17
         7: aload_0
         8: getfield      #18                 // Field window:Ljava/awt/Window;
        11: invokestatic  #73                 // Method java/awt/Cursor.getDefaultCursor:()Ljava/awt/Cursor;
        14: invokevirtual #60                 // Method java/awt/Window.setCursor:(Ljava/awt/Cursor;)V
        17: return
      LineNumberTable:
        line 143: 0
        line 144: 7
        line 146: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/commons/gui/ComponentResizer;
            0      18     1     e   Ljava/awt/event/MouseEvent;
      StackMapTable: number_of_entries = 1
        frame_type = 17 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #109                // class java/awt/Dimension
         3: dup
         4: sipush        600
         7: sipush        400
        10: invokespecial #141                // Method java/awt/Dimension."<init>":(II)V
        13: putstatic     #104                // Field MIN_SIZE:Ljava/awt/Dimension;
        16: return
      LineNumberTable:
        line 31: 0
}
SourceFile: "ComponentResizer.java"
