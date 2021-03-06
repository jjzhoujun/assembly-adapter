package me.panpf.adapter.sample.item

import androidx.fragment.app.Fragment

import me.panpf.adapter.pager.AssemblyFragmentItemFactory
import me.panpf.adapter.sample.ui.ImageFragment

class ImageFragmentItemFactory : AssemblyFragmentItemFactory<String>() {
    override fun match(data: Any?): Boolean {
        return data is String
    }

    override fun createFragment(position: Int, string: String?): Fragment {
        val imageFragment = ImageFragment()
        imageFragment.arguments = ImageFragment.buildParams(string?:"")
        return imageFragment
    }
}
