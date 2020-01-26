# Learning Notes

### Lesson 1 - Building Layouts Part 1
- A view is a rectangle on the screen that shows some content. View makes up a layout on the screen.
- Types of views:
    - TextView
    - ImageView
    - Button
- Views are basic building blocks for building the layout of your app
- Views have a format of camel case
- Essential to know how to group or separate views.

</br>

- XML stands for Extensible Markup Language
- XML contains an open bracket, view type, list of attributes, closing tag
- XML tags can either be self-closing or separate closing tag

</br>

- View can have a parent/child relationship
- E.g. LinearLayout can have textView and buttons
- Attributes are characteristics that determine the behavior or appearance of the view.
- Each attribute has a name and value
- Attribute's value are in quotation marks
- View have a default value. Declaring an attribute override default values.

</br>

- TextView are used for text
- May contain margin, padding defined by dp
- dp is density independent pixels
- Pixels may vary on devices, so dp maps out the correlation between each device
- Tough target should be at least 48dp
- TextSize are configured by `android:textSize`
- TextSize's value is sp - scale independent pixel
- sp scales with user's font preference in settings (small, normal, large or huge)

</br>

- View's height and width can be set in three ways: hard-coding, wrap-content and match parent
- TextColor can be set by `android:textColor` followed by a hex value
- ImageView are image fields. They should include the source of the image and scaleType. For accessibility, also include contentDescription.

- Scale Type
    - CENTER: center the image in the view, but perform no scaling.
    - CENTER_CROP: scale the image uniformly (maintain image's aspect ratio) so that both dimensions of the image will be equal to or larger than corresponding the dimension of the view.
    - CENTER_INSIDE: scale the image uniformly (maintain image's aspect ratio) so that both dimension of the image will be equal to or less than the corresponding dimension of the view.
    - FIT_CENTER: scale the image using Matrix.ScaleToFit#CENTER. Compute a scale that will maintain the original src aspect ratio, but will also ensure that src fits entirely inside dst. The result is centered inside.
    - FIT_END: scale the image using Matrix.ScaleToFit#END. Compute a scale that will maintain the original src aspect ratio, but will also ensure that src fits entirely inside dist. End aligns the result to the right and bottom edges.
    - FIT_START: scale the image using Matrix.ScaleToFit#START. Compute a scale that will maintain the original src aspect ratio, but will also ensure that src fits entirely inside dist. Start aligns the result to the left and top edges.
    - FIT_XY: scale the image using Matrix.ScaleToFit#FILL. Scale in X and Y independently, so that src matches dst exactly. This may change the aspect ratio of the src.
    - MATRIX: scale using the image matrix when drawing.

</br>

### Lesson 2 - Building Layouts Part 2

- View must include a root view
- Adding textView without a root view will cause an error
- There can be only one root view and it should enclose other views
- ViewGroup are container for view
- TextView, ImageView are child views
- RelativeLayout, LinearLayout are ViewGroups that are parent views

</br>

- XML namespace declaration are specified in the xml document
- Use this namespace to specify all of the attributes that belong to Android
- `xmlns:android="http://schemas.android.com/apk/res/android"`
- ID distinguish identification for views
- Declaring new ids: `@+id/text_view`
- Referencing existing ids: `@id/text_view`

</br>

- Padding are handled by the view (creates spacing within view)
- Margin are handled by parent viewGroup (creates spacing outside view)
- LinearLayout can create equal spacing
- More information about [LinearLayout](https://developer.android.com/guide/topics/ui/layout/linear.html?utm_source=udacity&utm_medium=course&utm_campaign=android_basics)
- Can contain vertical or horizontal orientation 
- RelativeLayout allow custom positioning of views
- Documentation regarding [RelativeLayout](https://developer.android.com/reference/android/widget/RelativeLayout.LayoutParams.html?utm_source=udacity&utm_medium=course&utm_campaign=android_basics)

</br>

### Lesson 3 - Practice Set Building Layouts

- ConstraintLayout: a tool that makes it super fast to create responsive UIs with many different types of components. 
- ConstraintLayout is a great tool to have, but RelativeLayout and LinearLayout are much simpler.
- LinearLayout: good for aligning rows or column. Good way to divide by weight
- RelativeLayout: good for positioning relative to other elements and overlapping views
- The ordering of the xml matter as that determines how each view will be overlapped in the relativeLayout.