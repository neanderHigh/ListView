# ListView

This Programming example covers the following topics:
* ListView
* Custom ListView Item (dedicated layout xml-file)
* Custom ArrayAdapter (separate class file)
* ViewHolder Pattern (within the ArrayAdapter)

Description:

This is a small Android Application which shows a ListView example.
Each ListView may consist of any number of View- or ViewGroup Items. In our example we use a custom ViewGroup.
It is defined in the file row_layout_triple.xml.
To connect any kind of data (e.g. an array of String objects) with the ListView, we use a custom ArrayAdapter.
Within this ArrayAdapter we make use of the so called ViewHolder pattern. This ensures that we have a smooth scrolling experience even if we load hundreds or thousands of data rows.


