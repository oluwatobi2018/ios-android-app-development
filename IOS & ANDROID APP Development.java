public class HelloWorld { 
    private Form current; 
    private Resources theme; 

    // ... class methods ...
}
public void init(Object context) { 
    updateNetworkThreadCount(2); 
    theme = UIManager.initFirstTheme("/theme"); 
    Toolbar.setGlobalToolbar(true); 
    Log.bindCrashProtection(true); 
    addNetworkErrorListener(err -> { 
        err.consume(); 
        if(err.getError() != null) { 
            Log.e(err.getError());
        }
        Log.sendLogAsync(); 
        Dialog.show("Connection Error", 
            "There was a networking error in the connection to " +
            err.getConnectionRequest().getUrl(), "OK", null);
    });
    public void start() {
        if(current != null){ 
            current.show(); 
            return;
        }
        Form hi = new Form("Hi World", BoxLayout.y()); 
        hi.add(new Label("Hi World")); 
        hi.show(); 
    }
    public void stop() { 
        current = getCurrentForm(); 
        if(current instanceof Dialog) { 
            ((Dialog)current).dispose();
            current = getCurrentForm();
        }
    }
    
    public void destroy() { 
    }
    public class MyApplication {
        private Form current;
        private Resources theme;
    
        public void init(Object context) {
            theme = UIManager.initFirstTheme("/theme");
            Toolbar.setGlobalToolbar(true);
            Log.bindCrashProtection(true);
        }
    
        public void start() {
            if(current != null){
                current.show();
                return;
            }
            Form hi = new Form("Hi World", BoxLayout.y());
            hi.add(new Label("Hi World"));
            hi.show();
        }
    
        public void stop() {
            current = getCurrentForm();
            if(current instanceof Dialog) {
                ((Dialog)current).dispose();
                current = getCurrentForm();
            }
        }
    
        public void destroy() {
        }
    }
    class MyApplication {
        private var current: Form? = null
        private var theme: Resources? = null
    
        fun init(context: Any) {
            theme = UIManager.initFirstTheme("/theme")
            Toolbar.setGlobalToolbar(true)
            Log.bindCrashProtection(true)
        }
    
        fun start() {
            if (current != null) {
                current!!.show()
                return
            }
            val hi = Form("Hi World", BoxLayout.y())
            hi.add(Label("Hi World"))
            hi.show()
        }
    
        fun stop() {
            current = getCurrentForm()
            if (current is Dialog) {
                (current as Dialog).dispose()
                current = getCurrentForm()
            }
        }
    
        fun destroy() {
        }
    }
    open class MyApplication
    open class MyApplication {
        private var current: Form? = null
        private var theme: Resources? = null
        fun init(context: Any?) {
            theme = UIManager.initFirstTheme("/theme")
            Toolbar.setGlobalToolbar(true)
            Log.bindCrashProtection(true)
        }
    
        fun start() {
            if (current != null) {
                current!!.show()
                return
            }
            val hi = Form("Hi World", BoxLayout.y())
            hi.add(Label("Hi World"))
            hi.show()
        }
    
        fun stop() {
            current = getCurrentForm()
            if (current is Dialog) {
                (current as Dialog).dispose()
                current = getCurrentForm()
            }
        }
    
        fun destroy() {
        }
    }
    Container cnt = new Container(BoxLayout.y());
cnt.add(new Label("Just Added"));
cnt.add(NORTH, new Label("Just Added"));
Container cnt = new Container(BoxLayout.y());
cnt.add(new Label("Just Added")); 
cnt.addAll(new Label("Adding Multiple"), 
    new Label("Second One"));

cnt.add(new Label("Chaining")). 
    add(new Label("Value"));
    Container boxY = BoxLayout.encloseY(cmp1, cmp2); 
Container boxX = BoxLayout.encloseX(cmp3, cmp4);
Container flowCenter = FlowLayout. 
    encloseCenter(cmp5, cmp6);
    Form hi = new Form("Flow Layout", new FlowLayout());
hi.add(new Label("First")).
    add(new Label("Second")).
    add(new Label("Third")).
    add(new Label("Fourth")).
    add(new Label("Fifth"));
hi.show();
Container flowLayout = FlowLayout.encloseIn(
        new Label("First"),
        new Label("Second"),
        new Label("Third"),
        new Label("Fourth"),
        new Label("Fifth")));
        Form hi = new Form("Box Y Layout", new BoxLayout(BoxLayout.Y_AXIS));
hi.add(new Label("First")).
    add(new Label("Second")).
    add(new Label("Third")).
    add(new Label("Fourth")).
    add(new Label("Fifth"));
    Container box = BoxLayout.encloseX(new Label("First"),
        new Label("Second"),
        new Label("Third"),
        new Label("Fourth"),
        new Label("Fifth")));
        Form hi = new Form("Border Layout", new BorderLayout());
hi.add(BorderLayout.CENTER, new Label("Center")).
    add(BorderLayout.SOUTH, new Label("South")).
    add(BorderLayout.NORTH, new Label("North")).
    add(BorderLayout.EAST, new Label("East")).
    add(BorderLayout.WEST, new Label("West"));
hi.show();
Form hi = new Form("Border Layout", new BorderLayout());
((BorderLayout)hi.getLayout()).setCenterBehavior(BorderLayout.CENTER_BEHAVIOR_CENTER);
hi.add(BorderLayout.CENTER, new Label("Center")).
    add(BorderLayout.SOUTH, new Label("South")).
    add(BorderLayout.NORTH, new Label("North")).
    add(BorderLayout.EAST, new Label("East")).
    add(BorderLayout.WEST, new Label("West"));
hi.show();
TextModeLayout tl = new TextModeLayout(3, 2);
Form f = new Form("Pixel Perfect", tl);
TextComponent title = new TextComponent().label("Title");
TextComponent price = new TextComponent().label("Price");
TextComponent location = new TextComponent().label("Location");
TextComponent description = new TextComponent().label("Description").multiline(true);

f.add(tl.createConstraint().horizontalSpan(2), title);
f.add(tl.createConstraint().widthPercentage(30), price);
f.add(tl.createConstraint().widthPercentage(70), location);
f.add(tl.createConstraint().horizontalSpan(2), description);
f.setEditOnShow(title.getField());
f.show();
Form hi = new Form("Layered Layout");
int w = Math.min(Display.getInstance().getDisplayWidth(), Display.getInstance().getDisplayHeight());
Button settingsLabel = new Button("");
Style settingsStyle = settingsLabel.getAllStyles();
settingsStyle.setFgColor(0xff);
settingsStyle.setBorder(null);
settingsStyle.setBgColor(0xff00);
settingsStyle.setBgTransparency(255);
settingsStyle.setFont(settingsLabel.getUnselectedStyle().getFont().derive(w / 3, Font.STYLE_PLAIN));
FontImage.setMaterialIcon(settingsLabel, FontImage.MATERIAL_SETTINGS);
Button close = new Button("");
close.setUIID("Container");
close.getAllStyles().setFgColor(0xff0000);
FontImage.setMaterialIcon(close, FontImage.MATERIAL_CLOSE);
hi.add(LayeredLayout.encloseIn(settingsLabel,
        FlowLayout.encloseRight(close)));
        Container cnt = new Container(new LayeredLayout());
Button btn = new Button("Submit");
LayeredLayout ll = (LayeredLayout)cnt.getLayout();
cnt.add(btn);
ll.setInsets(btn, "auto 0 0 auto");
x = cnt.paddingLeft + cmp.calculatedInsetLeft + cmp.marginLeft
y = cnt.paddingTop + cmp.calculatedInsetTop + cmp.marginTop
w = cnt.width - cnt.verticalScroll.width - cnt.paddingRight - cmp.calculatedInsetRight - cmp.marginRight - x
h = cnt.height - cnt.horizontalScroll.height - cnt.paddingBottom - cmp.calculatedInsetBottom - cmp.marginBottom - y
x = cnt.paddingLeft + cmp.calculatedInsetLeft + cmp.marginLeft
y = cnt.paddingTop + cmp.calculatedInsetTop + cmp.marginTop
w = cnt.width - cnt.verticalScroll.width - cnt.paddingRight - cmp.calculatedInsetRight - cmp.marginRight - x
h = cnt.height - cnt.horizontalScroll.height - cnt.paddingBottom - cmp.calculatedInsetBottom - cmp.marginBottom - y
background-image: url(images/NowLogo.png),
        url(images/Username-icon.png),
        url(images/Password-icon.png),
        url(images/Name-icon.png),
        url(images/Email-icon.png),
        url(images/SeaIce.png),
        url(images/Back-icon.png),
        url(images/Source-icon.png),
        url(images/Date-icon.png),
        url(images/Arrow-right.png),
        url(images/Share-icon.png),
        url(images/Text-icon.png),
        url(images/Comments-icon.png),
        url(images/RedPlanet.png),
        url(images/News-icon.png),
        url(images/Channels-icon.png),
        url(images/Bookmarks-icon.png),
        url(images/Overview-icon.png),
        url(images/Calendar-icon.png),
        url(images/Timeline-icon.png),
        url(images/Profile-icon.png),
        url(images/Widgets-icon.png),
        url(images/Settings-icon.png),
        url(images/Bookmark-icon.png);
}
@font-face {
    font-family: "Montserrat";
    src: url(res/Montserrat-Regular.ttf);
}

@font-face {
    font-family: "Montserrat-Bold";
    src: url(res/Montserrat-Bold.ttf);
}

@font-face {
    font-family: "FontAwesome";
    src: url(github://FontAwesome/Font-Awesome/blob/master/fonts/fontawesome-webfont.ttf);
}

PlainText0p5mm {
    font-size: 0.5mm;
}

PlainText1mm {
    font-size: 1mm;
}

PlainText2mm {
    font-size: 2mm;
}

PlainText5mm {
    font-size: 5mm;
}

PlainText10mm {
    font-size: 10mm;
}

PlainText50mm {
    font-size: 50mm;
}

PlainTextSmall {
    font-size: small;
}

PlainTextMedium {
    font-size: medium;
}

PlainTextLarge {
    font-size: large;
}

PlainText3pt {
    font-size: 3pt;
}

PlainText6pt {
    font-size: 6pt;
}

PlainText12pt {
    font-size: 12pt;
}

PlainText20pt {
    font-size: 20pt;
}

PlainText36pt {
    font-size: 36pt;
}

BoldText {
    font-weight: bold;
}

BoldText1mm {
    font-weight: bold;
    font-size: 1mm;
}

BoldText2mm {
    font-weight: bold;
    font-size: 2mm;
}

BoldText3mm {
    font-weight: bold;
    font-size: 3mm;
}

BoldText5mm {
    font-weight: bold;
    font-size: 5mm;
}

ItalicText {
    font-style: italic;
}

ItalicText3mm {
    font-style: italic;
    font-size: 3mm;
}

ItalicBoldText {
    font-style: italic;
    font-weight: bold;
}

PlainTextUnderline {
    text-decoration: underline;
}

BoldTextUnderline {
    text-decoration: underline;
    font-weight: bold;
}

ItalicTextUnderline {
    text-decoration: underline;
    font-style: italic;
}

PlainText3d {
    text-decoration: cn1-3d;
    color:white;
    background-color: #3399ff
}

BoldText3d {
    text-decoration: cn1-3d;
    font-weight: bold;
    color:white;
    background-color: #3399ff;
}

ItalicText3d {
    text-decoration: cn1-3d;
    font-style: italic;
    color:white;
    background-color: #3399ff;
}

PlainText3dLowered {
    text-decoration: cn1-3d-lowered;
    color:black;
    background-color: #3399ff;
}

BoldText3dLowered {
    text-decoration: cn1-3d-lowered;
    font-weight: bold;
    color:black;
    background-color: #3399ff;
}

ItalicText3dLowered {
    text-decoration: cn1-3d-lowered;
    font-style: italic;
    color:black;
    background-color: #3399ff;
}

PlainText3dShadow {
    text-decoration: cn1-3d-shadow-north;
    color:white;
    background-color: #3399ff;
}

BoldText3dShadow {
    text-decoration: cn1-3d-shadow-north;
    font-weight: bold;
    color:white;
    background-color: #3399ff;
}

ItalicText3dShadow {
    text-decoration: cn1-3d-shadow-north;
    font-style: italic;
    color:white;
    background-color: #3399ff;
}


MainThin {

    font-size: 200%;
    background: radial-gradient(circle at top left, yellow, blue 100%);
}

MainRegular0001 {
    font-family: "native:MainRegular";
    /*background: cn1-pill-border;
    background-color: red;*/
    color: blue;
    border: 1px cn1-pill-border blue;
    /*box-shadow: 1mm 1mm 0 2mm rgba(0,0,0,1.0);*/
    padding: 2mm;
}

MainRegular0001.pressed {
    font-family: "native:MainRegular";
    background: cn1-pill-border blue;
    /*background-color: red;*/
    color: white;
    border: 1px solid white;
    /*box-shadow: 1mm 1mm 0 2mm rgba(0,0,0,1.0);*/
    padding: 2mm;
}

Heading {
    font-size: 4mm;
    font-family: "Montserrat-Bold";
    color: black;
    padding: 2mm;
    text-align: center;
}

XMLVIewIcon {
    font-family: "FontAwesome";
}
Validator v = new Validator();
v.addConstraint(firstName, new LengthConstraint(2)).
        addConstraint(surname, new LengthConstraint(2)).
        addConstraint(url, RegexConstraint.validURL()).
        addConstraint(email, RegexConstraint.validEmail()).
        addConstraint(phone, new RegexConstraint(phoneRegex, "Must be valid phone number")).
        addConstraint(num1, new LengthConstraint(4)).
        addConstraint(num2, new LengthConstraint(4)).
        addConstraint(num3, new LengthConstraint(4)).
        addConstraint(num4, new LengthConstraint(4));

v.addSubmitButtons(submit);
int pageNumber = 1;
java.util.List<Map<String, Object>> fetchPropertyData(String text) {
    try {
        ConnectionRequest r = new ConnectionRequest();
        r.setPost(false);
        r.setUrl("http://api.nestoria.co.uk/api");
        r.addArgument("pretty", "0");
        r.addArgument("action", "search_listings");
        r.addArgument("encoding", "json");
        r.addArgument("listing_type", "buy");
        r.addArgument("page", "" + pageNumber);
        pageNumber++;
        r.addArgument("country", "uk");
        r.addArgument("place_name", text);
        NetworkManager.getInstance().addToQueueAndWait(r);
        Map<String,Object> result = new JSONParser().parseJSON(new InputStreamReader(new ByteArrayInputStream(r.getResponseData()), "UTF-8"));
        Map<String, Object> response = (Map<String, Object>)result.get("response");
        return (java.util.List<Map<String, Object>>)response.get("listings");
    } catch(Exception err) {
        Log.e(err);
        return null;
    }
}
Form hi = new Form("InfiniteScrollAdapter", new BoxLayout(BoxLayout.Y_AXIS));

Style s = UIManager.getInstance().getComponentStyle("MultiLine1");
FontImage p = FontImage.createMaterial(FontImage.MATERIAL_PORTRAIT, s);
EncodedImage placeholder = EncodedImage.createFromImage(p.scaled(p.getWidth() * 3, p.getHeight() * 3), false); 

InfiniteScrollAdapter.createInfiniteScroll(hi.getContentPane(), () -> { 
    java.util.List<Map<String, Object>> data = fetchPropertyData("Leeds"); 
    MultiButton[] cmps = new MultiButton[data.size()];
    for(int iter = 0 ; iter < cmps.length ; iter++) {
        Map<String, Object> currentListing = data.get(iter);
        if(currentListing == null) { 
            InfiniteScrollAdapter.addMoreComponents(hi.getContentPane(), new Component[0], false);
            return;
        }
        String thumb_url = (String)currentListing.get("thumb_url");
        String guid = (String)currentListing.get("guid");
        String summary = (String)currentListing.get("summary");
        cmps[iter] = new MultiButton(summary);
        cmps[iter].setIcon(URLImage.createToStorage(placeholder, guid, thumb_url));
    }
    InfiniteScrollAdapter.addMoreComponents(hi.getContentPane(), cmps, true); 
}, true); 
Form hi = new Form("InfiniteContainer", new BorderLayout());

Style s = UIManager.getInstance().getComponentStyle("MultiLine1");
FontImage p = FontImage.createMaterial(FontImage.MATERIAL_PORTRAIT, s);
EncodedImage placeholder = EncodedImage.createFromImage(p.scaled(p.getWidth() * 3, p.getHeight() * 3), false);

InfiniteContainer ic = new InfiniteContainer() {
    @Override
    public Component[] fetchComponents(int index, int amount) {
        java.util.List<Map<String, Object>> data = fetchPropertyData("Leeds");
        MultiButton[] cmps = new MultiButton[data.size()];
        for(int iter = 0 ; iter < cmps.length ; iter++) {
            Map<String, Object> currentListing = data.get(iter);
            if(currentListing == null) {
                return null;
            }
            String thumb_url = (String)currentListing.get("thumb_url");
            String guid = (String)currentListing.get("guid");
            String summary = (String)currentListing.get("summary");
            cmps[iter] = new MultiButton(summary);
            cmps[iter].setIcon(URLImage.createToStorage(placeholder, guid, thumb_url));
        }
        return cmps;
    }
};
hi.add(BorderLayout.CENTER, ic);
Form hi = new Form("MultiList", new BorderLayout());

ArrayList<Map<String, Object>> data = new ArrayList<>();

data.add(createListEntry("A Game of Thrones", "1996"));
data.add(createListEntry("A Clash Of Kings", "1998"));
data.add(createListEntry("A Storm Of Swords", "2000"));
data.add(createListEntry("A Feast For Crows", "2005"));
data.add(createListEntry("A Dance With Dragons", "2011"));
data.add(createListEntry("The Winds of Winter", "2016 (please, please, please)"));
data.add(createListEntry("A Dream of Spring", "Ugh"));

DefaultListModel<Map<String, Object>> model = new DefaultListModel<>(data);
MultiList ml = new MultiList(model);
hi.add(BorderLayout.CENTER, ml);
private Map<String, Object> createListEntry(String name, String date) {
    Map<String, Object> entry = new HashMap<>();
    entry.put("Line1", name);
    entry.put("Line2", date);
    return entry;
}
private Map<String, Object> createListEntry(String name, String date, Image cover) {
    Map<String, Object> entry = new HashMap<>();
    entry.put("Line1", name);
    entry.put("Line2", date);
    entry.put("icon", cover);
    return entry;
}
package com.mycompany.myapp;

import android.util.Log; 

public class MyNativeImpl { 
    
    public String helloWorld(String param) {
        Log.d("MyApp", param);
        return "Tada";
    }

    public boolean isSupported() { 
        return true;
    }
}
com.codename1.impl.android.AndroidImplementation.runOnUiThreadAndBlock(new Runnable() {
    public void run() {
       // your native code here...
    }
});
-(void)test:(char)param param1:(BOOL)param1
    param2:(int)param2 param3:(short)param3 param4:(int)param4
    param5:(long long)param5 param6:(float)param6
    param7:(double)param7 param8:(NSString*)param8
    param9:(NSData*)param9 param10:(NSData*)param10
    param11:(NSData*)param11 param12:(NSData*)param12
    param13:(NSData*)param13 param14:(NSData*)param14
    param15:(NSData*)param15 param16:(NSData*)param16
    param17:(void*)param17;
}