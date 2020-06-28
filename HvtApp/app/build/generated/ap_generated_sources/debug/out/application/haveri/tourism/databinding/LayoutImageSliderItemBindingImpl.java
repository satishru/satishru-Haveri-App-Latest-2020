package application.haveri.tourism.databinding;
import application.haveri.tourism.R;
import application.haveri.tourism.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutImageSliderItemBindingImpl extends LayoutImageSliderItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutImageSliderItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private LayoutImageSliderItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            );
        this.ivSliderImage.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.imageObj == variableId) {
            setImageObj((application.haveri.tourism.data.model.api.response.haveri_data.Images) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setImageObj(@Nullable application.haveri.tourism.data.model.api.response.haveri_data.Images ImageObj) {
        this.mImageObj = ImageObj;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.imageObj);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        application.haveri.tourism.data.model.api.response.haveri_data.Images imageObj = mImageObj;
        java.lang.String imageObjImageUrl = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (imageObj != null) {
                    // read imageObj.imageUrl
                    imageObjImageUrl = imageObj.getImageUrl();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            application.haveri.tourism.utils.BindingUtils.setImageFullUrl(this.ivSliderImage, imageObjImageUrl);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): imageObj
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}