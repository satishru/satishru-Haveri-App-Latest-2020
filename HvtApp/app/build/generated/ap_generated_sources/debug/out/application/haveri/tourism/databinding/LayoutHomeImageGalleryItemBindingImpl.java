package application.haveri.tourism.databinding;
import application.haveri.tourism.R;
import application.haveri.tourism.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutHomeImageGalleryItemBindingImpl extends LayoutHomeImageGalleryItemBinding implements application.haveri.tourism.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_plus_count, 4);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutHomeImageGalleryItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private LayoutHomeImageGalleryItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.RelativeLayout) bindings[1]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[3]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[4]
            );
        this.cardContent.setTag(null);
        this.ivImage.setTag(null);
        this.rlContent.setTag(null);
        this.tvImageTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback21 = new application.haveri.tourism.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((application.haveri.tourism.ui.fragment.home.adapter.gallery.HomeImageGalleryAdapterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable application.haveri.tourism.ui.fragment.home.adapter.gallery.HomeImageGalleryAdapterViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelImageUrl((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelImageTitle((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelImageUrl(androidx.databinding.ObservableField<java.lang.String> ViewModelImageUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelImageTitle(androidx.databinding.ObservableField<java.lang.String> ViewModelImageTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.databinding.ObservableField<java.lang.String> viewModelImageUrl = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelImageTitle = null;
        java.lang.String viewModelImageUrlGet = null;
        application.haveri.tourism.ui.fragment.home.adapter.gallery.HomeImageGalleryAdapterViewModel viewModel = mViewModel;
        java.lang.String viewModelImageTitleGet = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.imageUrl
                        viewModelImageUrl = viewModel.imageUrl;
                    }
                    updateRegistration(0, viewModelImageUrl);


                    if (viewModelImageUrl != null) {
                        // read viewModel.imageUrl.get()
                        viewModelImageUrlGet = viewModelImageUrl.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.imageTitle
                        viewModelImageTitle = viewModel.imageTitle;
                    }
                    updateRegistration(1, viewModelImageTitle);


                    if (viewModelImageTitle != null) {
                        // read viewModel.imageTitle.get()
                        viewModelImageTitleGet = viewModelImageTitle.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            application.haveri.tourism.utils.BindingUtils.setCropImageUrl(this.ivImage, viewModelImageUrlGet);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.rlContent.setOnClickListener(mCallback21);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvImageTitle, viewModelImageTitleGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        application.haveri.tourism.ui.fragment.home.adapter.gallery.HomeImageGalleryAdapterViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onItemClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.imageUrl
        flag 1 (0x2L): viewModel.imageTitle
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}