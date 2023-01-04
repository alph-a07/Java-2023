# Comparable Vs Comparator

<table class="alt">
<tbody><tr><th>Comparable</th><th>Comparator</th></tr>
<tr><td>1) Comparable provides a <strong>single sorting sequence</strong>. In other words, we can sort the collection on the basis of a single element such as id, name, and price.</td><td> The Comparator provides <strong>multiple sorting sequences</strong>. In other words, we can sort the collection on the basis of multiple elements such as id, name, and price etc.</td></tr>
<tr><td>2) Comparable <strong>affects the original class</strong>, i.e., the actual class is modified.</td><td>Comparator <strong>doesn't affect the original class</strong>, i.e., the actual class is not modified.</td></tr>
<tr><td>3) Comparable provides <strong>compareTo() method</strong> to sort elements.</td><td>Comparator provides <strong>compare() method</strong> to sort elements.</td></tr>
<tr><td>4) Comparable is present in <strong>java.lang</strong> package.</td><td>A Comparator is present in the <strong>java.util</strong> package.</td></tr>
<tr><td>5) We can sort the list elements of Comparable type by <strong>Collections.sort(List)</strong> method.</td><td>We can sort the list elements of Comparator type by <strong>Collections.sort(List, Comparator)</strong> method.</td></tr>
</tbody></table>

