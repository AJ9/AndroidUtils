# AndroidUtils

AssetManager mg = getResources().getAssets();

try {
String[] files = mg.list("");
mg.open("test.pdf");

} catch (IOException ex) {
ex.printStackTrace();
}