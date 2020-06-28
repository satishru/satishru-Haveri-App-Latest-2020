package application.haveri.tourism.databinding;
import application.haveri.tourism.R;
import application.haveri.tourism.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutVideoListItemBindingImpl extends LayoutVideoListItemBinding implements application.haveri.tourism.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btn_play, 4);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutVideoListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private LayoutVideoListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[4]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.RelativeLayout) bindings[1]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[3]
            );
        this.cardContent.setTag(null);
        this.ivVideoThumb.setTag(null);
        this.rlContent.setTag(null);
        this.tvVideoTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new application.haveri.tourism.generated.callback.OnClickListener(this, 1);
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
            setViewModel((application.haveri.tourism.ui.fragment.common.adapter.VideoListAdapterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable application.haveri.tourism.ui.fragment.common.adapter.VideoListAdapterViewModel ViewModel) {
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
                return onChangeViewModelVideoTitle((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelVideoId((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelVideoTitle(androidx.databinding.ObservableField<java.lang.String> ViewModelVideoTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVideoId(androidx.databinding.ObservableField<java.lang.String> ViewModelVideoId, int fieldId) {
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
        androidx.databinding.ObservableField<java.lang.String> viewModelVideoTitle = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelVideoId = null;
        application.haveri.tourism.ui.fragment.common.adapter.VideoListAdapterViewModel viewModel = mViewModel;
        java.lang.String viewModelVideoTitleGet = null;
        java.lang.String viewModelVideoIdGet = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.videoTitle
                        viewModelVideoTitle = viewModel.videoTitle;
                    }
                    updateRegistration(0, viewModelVideoTitle);


                    if (viewModelVideoTitle != null) {
                        // read viewModel.videoTitle.get()
                        viewModelVideoTitleGet = viewModelVideoTitle.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.videoId
                        viewModelVideoId = viewModel.videoId;
                    }
                    updateRegistration(1, viewModelVideoId);


                    if (viewModelVideoId != null) {
                        // read viewModel.videoId.get()
                        viewModelVideoIdGet = viewModelVideoId.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            application.haveri.tourism.utils.BindingUtils.setYouTubeImageUrl(this.ivVideoThumb, viewModelVideoIdGet);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.rlContent.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvVideoTitle, viewModelVideoTitleGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        application.haveri.tourism.ui.fragment.common.adapter.VideoListAdapterViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onVideoClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.videoTitle
        flag 1 (0x2L): viewModel.videoId
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}