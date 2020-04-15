package vn.hust.edu.otherlistbasedexamples;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class LRContactAdapter extends BaseAdapter {

    List<ContactModel> contacts;

    public LRContactAdapter(List<ContactModel> contacts) {
        this.contacts = contacts;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int i) {
        return contacts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getItemViewType(int position) {
        if (contacts.get(position).isLeft() == true)
            return 0;
        else
            return 1;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {

        if (getItemViewType(i) == 0)
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_item_left, viewGroup, false);
        else
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_item_right, viewGroup, false);

        ImageView imageAvatar = view.findViewById(R.id.image_avatar);
        TextView textFullname = view.findViewById(R.id.text_fullname);

        final ContactModel contact = contacts.get(i);
        imageAvatar.setImageResource(contact.getAvatarResource());
        textFullname.setText(contact.getFullname());

//        viewHolder.chkSelected.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                boolean isSelected = contacts.get(i).isSelected;
//                contacts.get(i).setSelected(!isSelected);
//                notifyDataSetChanged();
//            }
//        });

        return view;
    }

    class ViewHolder {
        ImageView imageAvatar;
        TextView textFullname;
        CheckBox chkSelected;
    }
}
