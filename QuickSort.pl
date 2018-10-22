use strict;
use warnings;

sub partition {
    my ($lista, $p, $r) = @_;
    my $x = $$lista[$r];
    my $i = $p - 1;
    for (my $j = $p; $j < @$lista - 1; $j++) {
        if ($$lista[$j] <= $x) {
            $i++;
            ($$lista[$i], $$lista[$j]) = ($$lista[$j], $$lista[$i]);
        }
    }
    ($$lista[$i + 1], $$lista[$r]) = ($$lista[$r], $$lista[$i + 1]);
    return $i + 1;
}


sub qsort {
    my ($lista, $p, $r) = @_;
    if ($p < $r) {
        my $q = &partition(\@$lista, $p, $r);
        &qsort(\@$lista, $p, $q - 1);
        &qsort(\@$lista, $q + 1, $r);
    }
}